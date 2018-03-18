package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StoraeDeliveryGuysListActivity;

import java.util.ArrayList;

/**
 * Created by Rotem on 16/03/2018.
 */

public class RequestAdapter extends BaseAdapter {

    private ArrayList<Request> data;
    private Context context;
    private String firstName;
    private String lastName;
    private String fullName;

    public RequestAdapter(ArrayList<Request> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Request request = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.storage_manage_request_new_my_list, parent, false);

//        TextView tvSMNewRequestInInventory = v.findViewById(R.id.tvSMNewRequestInInventory);
        TextView tvSMNewRequestMotherName = v.findViewById(R.id.tvSMNewRequestMotherName);
//        TextView tvSMNewRequestInStockNumber = v.findViewById(R.id.tvSMNewRequestInStockNumber);
        //TextView tvSMNewRequestShowProductNumber1 = v.findViewById(R.id.tvSMNewRequestShowProductNumber1);
        TextView tvSMNewRequestProductCapacity = v.findViewById(R.id.textView8);
        TextView tvSMNewRequestProductCapacityNumber = v.findViewById(R.id.textView9);
        Button btnSMNewRequestCallDeliveryGuy = v.findViewById(R.id.btnSMNewRequestCallDeliveryGuy);
        Button btnSMNewRequestChangeStatus = v.findViewById(R.id.btnSMNewRequestChangeStatus);

        firstName = request.getFirstName();
        lastName = request.getLastName();
        fullName = firstName + " " + lastName;


        tvSMNewRequestMotherName.setText(fullName);


        btnSMNewRequestChangeStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Alert Dialog?
                //DbUtil.updateRequest();
            }
        });

        btnSMNewRequestCallDeliveryGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //request.setStatus(1);
                //DbUtil.updateRequest(request, context);
                Gson gson = new Gson();
                String json = gson.toJson(request);
                Intent intent = new Intent(context, StoraeDeliveryGuysListActivity.class);
                intent.putExtra("theRequest", json);
                context.startActivity(intent);

            }
        });

        return v;
    }
}
