package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;

import java.util.ArrayList;

/**
 * Created by Rotem on 14/03/2018.
 */

public class DestinationAdapter extends BaseAdapter {

    private ArrayList arrayList;
    private Context context;
    private int i;

    public DestinationAdapter(ArrayList arrayList, Context context, int i) {
        this.arrayList = arrayList;
        this.context = context;
        this.i = i;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.delivery_guy_destination_list_my_list, parent, false);
        Donation donation = null;
        Request request = null;
        if (i == 0) {
            //ArrayList<Donation> donations = arrayList;
            donation = (Donation) arrayList.get(position);
        }
        if (i == 1) {
            request = (Request) arrayList.get(position);
        }
/*        if (arrayList != null) {
            if (arrayList.get(0) instanceof Donation) {
                ArrayList<Donation> donations = arrayList;
                donation = donations.get(position);
            } else if (arrayList.get(0) instanceof Request) {
                ArrayList<Request> requests = arrayList;
                request = requests.get(position);
            }
        }*/

        TextView tvName = v.findViewById(R.id.tvDestinationContactName);
        TextView tvAddress = v.findViewById(R.id.tvDestinationAddress);
        TextView tvFoodName = v.findViewById(R.id.tvDestinationFoodType);
        Button btnCall = v.findViewById(R.id.btnCallDestination);
        Button btnGet = v.findViewById(R.id.btnSMDonationFullAccept);

        if (donation != null) {
            tvName.setText(donation.getFulName());
            tvAddress.setText(donation.getStreetAddress());
            tvFoodName.setText(donation.getFood().getName());
        } else if (request != null) {
            tvName.setText(request.getFirstName() + " " + request.getLastName());
            //tvAddress.setText(request.get);
            //TODO: make get address method in Request
            tvAddress.setText("לגרום לזה לקרות! חחח");
            tvFoodName.setText("אוכל טעים");
        }

        final Donation finalDonation = donation;
        final Request finalRequest = request;
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make a call to -
                if (finalDonation != null) {
                    finalDonation.getPhone(); // this is the phone to call to
                } else if (finalRequest != null) {
                    // no phone in request
                }
            }
        });

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((Activity) context).recreate();
            }
        });


        return v;
    }
}
