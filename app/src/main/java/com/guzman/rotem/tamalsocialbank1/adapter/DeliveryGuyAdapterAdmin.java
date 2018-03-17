package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.admin.AdminDeliveryGuysActivity;
import com.guzman.rotem.tamalsocialbank1.admin.AdminDeliveryGuysEditActivity;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 12/03/2018.
 */

public class DeliveryGuyAdapterAdmin extends BaseAdapter {

    private ArrayList<DeliveryUser> data;
    private Context context;
    private String firstName;
    private String lastName;
    private String fullName;
    private String streetAndNumber;
    private String city;
    private String address;

    public DeliveryGuyAdapterAdmin(ArrayList<DeliveryUser> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final DeliveryUser deliveryGuy = data.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.admin_manage_delivery_guys_my_list, parent, false);

        TextView tvDeliveryGuyName = v.findViewById(R.id.tvDeliveryGuyName);
        TextView tvDeliveryGuyAddress = v.findViewById(R.id.tvDeliveryGuyAddress);
        Button btnEditDeliveryGuy = v.findViewById(R.id.btnEditDeliveryGuy);
        Button btnDeleteDeliveryGuy = v.findViewById(R.id.btnDeleteDeliveryGuy);

        firstName = deliveryGuy.getFirstName();
        lastName = deliveryGuy.getLastName();
        fullName = firstName + " " + lastName;

        streetAndNumber = deliveryGuy.getStreetNumber();
        city = deliveryGuy.getCity();
        address = streetAndNumber + " " + city;

        tvDeliveryGuyName.setText(fullName);
        tvDeliveryGuyAddress.setText(address);

        btnEditDeliveryGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new Gson();
                String json = gson.toJson(deliveryGuy);
                Intent intent = new Intent(context, AdminDeliveryGuysEditActivity.class);
                intent.putExtra("dlEdit", json);
                context.startActivity(intent);
            }
        });

        btnDeleteDeliveryGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbUtil.deleteUser(deliveryGuy.get_id(), deliveryGuy.get_rev());
                ((Activity) context).finish();
                Intent intent = new Intent(context, AdminDeliveryGuysActivity.class);
                context.startActivity(intent);
            }
        });
        return v;
    }
}
