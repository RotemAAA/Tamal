package com.guzman.rotem.tamalsocialbank1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class MomUserAdapter extends BaseAdapter {

    private ArrayList<MomUser> data;
    private Context context;
    private String firstName;
    private String lastName;
    private String fullName;
    private String streetAndNumber;
    private String city;
    private String address;

    public MomUserAdapter(ArrayList<MomUser> data, Context context) {
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

        final MomUser momUser = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.admin_manage_mother_my_list, parent, false);

        TextView tvSMNewRequestMotherName = v.findViewById(R.id.tvSMNewRequestMotherName);
        TextView tvMotherAddress = v.findViewById(R.id.tvMotherAddress);
        Button btnEditMother = v.findViewById(R.id.btnEditMother);
        Button btnDeleteMother = v.findViewById(R.id.btnDeleteMother);

        firstName = momUser.getFirstName();
        lastName = momUser.getLastName();
        fullName = firstName + " " + lastName;

        streetAndNumber = momUser.getStreetNumber();
        city = momUser.getCity();
        address = streetAndNumber + " " + city;

        tvSMNewRequestMotherName.setText(fullName);
        tvMotherAddress.setText(address);

        btnEditMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: edit mother
            }
        });

        btnDeleteMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: detete mother
            }
        });


        return v;
    }
}
