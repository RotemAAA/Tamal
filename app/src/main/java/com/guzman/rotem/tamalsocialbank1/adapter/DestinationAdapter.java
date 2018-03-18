package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 14/03/2018.
 */

public class DestinationAdapter extends BaseAdapter {

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

    private ArrayList arrayList;
    private Activity context;
    private int i;
    private DeliveryUser user;

    public DestinationAdapter(ArrayList arrayList, Activity context, int i) {
        this.arrayList = arrayList;
        this.context = context;
        this.i = i;
    }

    public DestinationAdapter(ArrayList arrayList, Activity context, int i, DeliveryUser user) {
        this.arrayList = arrayList;
        this.context = context;
        this.i = i;
        this.user = user;
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
    public View getView(int position, final View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        @SuppressLint("ViewHolder") final View v = inflater.inflate(R.layout.delivery_guy_destination_list_my_list, parent, false);
        Donation donation = null;
        Request request = null;
        if (i == 0) {
            //ArrayList<Donation> donations = arrayList;
            donation = (Donation) arrayList.get(position);
        }
        if (i == 1) {
            request = (Request) arrayList.get(position);
        }

        TextView tvName = v.findViewById(R.id.tvDestinationContactName);
        TextView tvAddress = v.findViewById(R.id.tvDestinationAddress);
        TextView tvFoodName = v.findViewById(R.id.tvDestinationFoodType);
        TextView tvAmount = v.findViewById(R.id.tvDestinationoodNum);
        Button btnCall = v.findViewById(R.id.btnCallDestination);
        final Button btnGet = v.findViewById(R.id.btnSMDonationFullAccept);

        if (donation != null) {
            tvName.setText(donation.getFulName());
            tvAddress.setText(donation.getStreetAddress());
            tvFoodName.setText(donation.getFood().getName());
            tvAmount.setText(String.valueOf(donation.getAmount()));
        } else if (request != null) {
            tvName.setText(request.getFirstName() + " " + request.getLastName());
            tvAddress.setText(request.getAddress());
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
                    finalRequest.getPhone(); //TODO: Call
                }
            }
        });

        final Donation finalDonation1 = donation;
        final Request finalRequest1 = request;
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalDonation1 != null) {
                    if (finalDonation1.getStatus() != 1) {
                        Donation d = finalDonation1;
                        d.setStatus(1);
                        DbUtil.updateDonation(d, context);
                        if (user != null) {
                            DeliveryUser secUser = user;
                            secUser.setDonations(new ArrayList<Donation>());
                            DbUtil.updateUser(secUser);
                            btnGet.setVisibility(View.INVISIBLE);
/*                            DbUtil.deleteUser(user.get_id(), user.get_rev());
                            DbUtil.writeToDb(context, dbAcnt, dbUser, dbPass, dbName, secUser);*/

                        }
                    }

                }
                if (finalRequest1 != null) {
                    if (finalRequest1.getStatus() != 1) {
                        finalRequest1.setStatus(1);
                        DbUtil.updateRequest(finalRequest1, context);
                        if (user != null) {
                            DeliveryUser secUser = user;
                            secUser.setRequests(new ArrayList<Request>());
                            DbUtil.updateUser(secUser);
                            btnGet.setVisibility(View.INVISIBLE);
/*                            DbUtil.deleteUser(user.get_id(), user.get_rev());
                            DbUtil.writeToDb(context, dbAcnt, dbUser, dbPass, dbName, secUser);*/

                        }
                    }
                }

                context.recreate();
            }
        });


        return v;
    }
}
