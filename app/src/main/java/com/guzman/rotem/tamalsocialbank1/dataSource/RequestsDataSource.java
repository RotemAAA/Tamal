package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.adapter.RequestAdapter;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 17/03/2018.
 */

public class RequestsDataSource extends AsyncTask<Void, Void, ArrayList<Request>> {
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "brommeninimelleandeeding";
    final String dbPass = "9cb4e3bf199f7c0c8eb51d862befb9899c5f0df1";
    final String dbName = "requests";

    private Context context;
    private Database database;
    private ListView listView;
    private int status;

    public RequestsDataSource(Context context, ListView listView, int status) {
        this.context = context;
        this.listView = listView;
        this.status = status;
    }

    public RequestsDataSource(Context context, ListView listView, int status, Request r) {
        this.context = context;
        this.listView = listView;
        this.status = status;
    }


    @Override
    protected ArrayList<Request> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        return DbUtil.getAllReqList(database);
    }

    @Override
    protected void onPostExecute(ArrayList<Request> requests) {
        //get the requests adapter and set adapter
        switch (status) {
            case 0:
                setReqs(requests, 0, listView);
                break;
            case 1:
                setReqs(requests, 1, listView);
                break;
            case 2:
                setReqs(requests, 2, listView);
                break;
            default:
                setReqs(requests, 0, listView);
                break;
        }
    }

    private void setReqs(ArrayList<Request> requests, int i, ListView listView) {
        ArrayList<Request> d1 = new ArrayList<>();
        for (Request request : requests) {
            if (request.getStatus() == i) {
                d1.add(request);
            }
        }
        RequestAdapter adapter = new RequestAdapter(requests, context);
        listView.setAdapter(adapter);
    }
}
