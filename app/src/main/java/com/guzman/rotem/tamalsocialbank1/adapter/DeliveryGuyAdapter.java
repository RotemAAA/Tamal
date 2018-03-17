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

import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class DeliveryGuyAdapter extends BaseAdapter {

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";


    private ArrayList<DeliveryUser> data;
    private Context context;
    private String firstName;
    private String lastName;
    private String fullName;
    private String streetAndNumber;
    private String city;
    private String address;
    private Donation d;

    public DeliveryGuyAdapter(ArrayList<DeliveryUser> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public DeliveryGuyAdapter(ArrayList<DeliveryUser> data, Context context, Donation d) {
        this.data = data;
        this.context = context;
        this.d = d;
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
    public View getView(int position, final View convertView, ViewGroup parent) {

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

        btnSDGLSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (d != null) {
                    String phone = deliveryGuy.getPhoneNumber();
                    String name = d.getFulName();
                    String address = d.getStreetAddress();
                    String donorPhone = d.getPhone();

                    ArrayList<Donation> donations = deliveryGuy.getDonations();
                    if (donations == null) {
                        donations = new ArrayList<>();
                    }
                    donations.add(d);
                    DbUtil.deleteUser(deliveryGuy.get_id(), deliveryGuy.get_rev());

                    deliveryGuy.setDonations(donations);
                    DeliveryUser dUser = new DeliveryUser(deliveryGuy.get_id(), deliveryGuy.getFirstName(), deliveryGuy.getLastName(), "Delivery", deliveryGuy.getPhoneNumber(), deliveryGuy.getCity(), deliveryGuy.getStreetNumber());
                    DbUtil.writeToDb(context, dbAcnt, dbUser, dbPass, dbName, dUser);
                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts(name + "\n" + address + "\n" + donorPhone, phone, null)));

                }
            }
        });

        return v;
    }


}
