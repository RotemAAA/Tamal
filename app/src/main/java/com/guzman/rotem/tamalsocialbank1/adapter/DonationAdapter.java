package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;

import java.util.ArrayList;

/**
 * Created by Rotem on 16/03/2018.
 */

public class DonationAdapter extends BaseAdapter {

    private ArrayList<Donation> data;
    private Context context;
    private String firstName;
    private String lastName;

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
    public View getView(int position, View convertView, ViewGroup paren) {

        final Donation donation = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.storage_manage_donation_my_list, paren, false);

        TextView tvSMDonationInInventory = v.findViewById(R.id.tvSMDonationInInventory);
        TextView tvSMDonationInInventoryNumberv = v.findViewById(R.id.tvSMDonationInInventoryNumberv);
        TextView tvSMDonationProductName1 = v.findViewById(R.id.tvSMDonationProductName1);
        TextView tvSMDonationProductNumber1 = v.findViewById(R.id.tvSMDonationProductNumber1);
        TextView tvSMDonationDonorName = v.findViewById(R.id.tvSMDonationDonorName);
        TextView tvSMDonationDate = v.findViewById(R.id.tvSMDonationDate);
        TextView tvSMDonationTime = v.findViewById(R.id.tvSMDonationTime);
        Button btnSMDonationBookDelivery = v.findViewById(R.id.btnSMDonationBookDelivery);
        Button btnSMDonationAccept = v.findViewById(R.id.btnSMDonationAccept);



        return v;
    }
}
