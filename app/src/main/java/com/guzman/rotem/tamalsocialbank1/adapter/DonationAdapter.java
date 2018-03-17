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
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StoraeDeliveryGuysListActivity;

import java.util.ArrayList;

/**
 * Created by Rotem on 16/03/2018.
 */

public class DonationAdapter extends BaseAdapter {
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "towellephapenerenefortic";
    final String dbPass = "8e602a9f89d418e279e3855219b98f4570340926";
    final String dbName = "demo";

    private ArrayList<Donation> data;
    private Context context;

    public DonationAdapter(ArrayList<Donation> data, Context context) {
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
    public View getView(int position, final View convertView, ViewGroup paren) {

        final Donation donation = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.storage_manage_donation_my_list, paren, false);

        //TextView tvSMDonationAmount = v.findViewById(R.id.tvSMDonationInInventory);
        //TextView tvSMDonationInInventoryNumberv = v.findViewById(R.id.tvSMDonationInInventoryNumberv);
        TextView tvSMDonationProductName1 = v.findViewById(R.id.tvSMDonationProductName1);
        TextView tvSMDonationProductNumber1 = v.findViewById(R.id.tvSMDonationProductNumber1);
        TextView tvSMDonationDonorName = v.findViewById(R.id.tvSMDonationDonorName);
/*        TextView tvSMDonationDate = v.findViewById(R.id.tvSMDonationDate);
        TextView tvSMDonationTime = v.findViewById(R.id.tvSMDonationTime);*/
        Button btnSMDonationBookDelivery = v.findViewById(R.id.btnSMDonationBookDelivery);
        Button btnSMDonationAccept = v.findViewById(R.id.btnSMDonationAccept);


        //TODO: set date and time, show in inventory amount
        tvSMDonationDonorName.setText(donation.getFulName());
        tvSMDonationProductName1.setText(donation.getFood().getName());
        tvSMDonationProductNumber1.setText(/*donation.getAmount()*/"3");

        btnSMDonationBookDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donation.setStatus(1);
                DbUtil.updateDonation(donation, context);
                Gson gson = new Gson();
                String json = gson.toJson(donation);
                Intent intent = new Intent(context, StoraeDeliveryGuysListActivity.class);
                intent.putExtra("theDonation", json);
                context.startActivity(intent);
            }
        });


        btnSMDonationAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: take the product name bring the supply json from server by the name, change ths status of donation, ++ supply amount
                donation.setStatus(2);
                DbUtil.updateDonation(donation, context);
/*
                Intent intent = new Intent(context, StorageDonationsActivity.class);
                context.startActivity(intent);
*/
                ((Activity) context).recreate();
            }
        });


        return v;
    }
}
