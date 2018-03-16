package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.User;
import com.guzman.rotem.tamalsocialbank1.adapter.MomUserAdapter;
import com.guzman.rotem.tamalsocialbank1.mother.MomUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class MomUserDataSource extends AsyncTask<Void, Void, ArrayList<MomUser>> {
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

    private ListView listView;
    private Activity context;
    private Database database;

    public MomUserDataSource(ListView listView, Activity context) {
        this.listView = listView;
        this.context = context;
    }

    @Override
    protected ArrayList<MomUser> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        ArrayList<User> users = DbUtil.getAllUsersList(database);
        ArrayList<MomUser> mUsers = new ArrayList<>();
        assert users != null;
        for (User user : users) {
            if (user.getRole().equals("Mother")) {
                MomUser mUser = database.find(MomUser.class, user.get_id());
                mUsers.add(mUser);
            }
        }
        return mUsers;
    }

    @Override
    protected void onPostExecute(ArrayList<MomUser> momUsers) {
        MomUserAdapter adapter = new MomUserAdapter(momUsers, context);
        listView.setAdapter(adapter);
    }
}
