package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.DropOffCenter;
import com.guzman.rotem.tamalsocialbank1.R;

import java.util.ArrayList;

/**
 * Created by Rotem on 10/03/2018.
 */

public class DropOffCenterAdapter extends BaseAdapter {

    private ArrayList<DropOffCenter> data;
    private Context context;


    public DropOffCenterAdapter(ArrayList<DropOffCenter> data, Context context) {
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

        final DropOffCenter center = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.drop_off_points_my_list, parent, false);

        TextView tvDropOffCenterName = v.findViewById(R.id.tvDropOffCenterName);
        TextView tvDropOffCenterAddress = v.findViewById(R.id.tvDropOffCenterAddress);
        TextView tvDropOffCenterPhone = v.findViewById(R.id.tvDropOffCenterPhone);
        Button btnDropOffCenterGoToWaze = v.findViewById(R.id.btnDropOffCenterGoToWaze);
        ImageView ivDropOffCenterName = v.findViewById(R.id.ivDropOffCenterName);
        ImageView ivDropOffCenterAddress = v.findViewById(R.id.ivDropOffCenterAddress);
        ImageView ivDropOffCenterPhone = v.findViewById(R.id.ivDropOffCenterPhone);

        tvDropOffCenterName.setText(center.getName());
        tvDropOffCenterAddress.setText(center.getAddress());
        tvDropOffCenterPhone.setText(center.getPhone());
        btnDropOffCenterGoToWaze.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try
                {
                    // Launch Waze to look for Hawaii:
                    String address = center.getAddress();
                    String url = "https://waze.com/ul?q=" + address + "";


                    Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( url ) );
                    context.startActivity(intent);
                }
                catch ( ActivityNotFoundException ex  )
                {
                    // If Waze is not installed, open it in Google Play:
                    Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "market://details?id=com.waze" ) );
                    context.startActivity(intent);
                }
            }
        });

        return v;
    }
}