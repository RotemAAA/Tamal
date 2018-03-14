package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;
import com.guzman.rotem.tamalsocialbank1.R;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class DeliveryGuyAdapter extends BaseAdapter {

    private ArrayList<DeliveryUser> data;
    private Context context;
    private String firstName;
    private String lastName;
    private String fullName;
    private String streetAndNumber;
    private String city;
    private String address;

    public DeliveryGuyAdapter(ArrayList<DeliveryUser> data, Context context) {
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

        final DeliveryUser deliveryGuy = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.storage_delivery_guys_list_my_list, parent, false);

        TextView tvSDGLName = v.findViewById(R.id.tvSDGLName);
        TextView tvSDGLAddress = v.findViewById(R.id.tvSDGLAddress);
        Button btnSDGLCall = v.findViewById(R.id.btnSDGLCall);
        Button btnSDGLSend = v.findViewById(R.id.btnSDGLSend);


        firstName = deliveryGuy.getFirstName();
        lastName = deliveryGuy.getLastName();
        fullName = firstName + " " + lastName;

        streetAndNumber = deliveryGuy.getStreetNumber();
        city = deliveryGuy.getCity();
        address = streetAndNumber + " " + city;

        tvSDGLName.setText(fullName);
        tvSDGLAddress.setText(address);

        btnSDGLCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = deliveryGuy.getPhoneNumber();

                Uri phoneUri = Uri.parse("tel:" + phone + "");

                Intent dialIntent = new Intent(Intent.ACTION_DIAL, phoneUri);
                context.startActivity(dialIntent);

            }
        });

        return v;
    }


    //TODO: btnSDGLSend --> send delivery guy to donor/mother
}
