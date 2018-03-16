package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.guzman.rotem.tamalsocialbank1.admin.AdminMotherActivity;
import com.guzman.rotem.tamalsocialbank1.admin.AdminMotherEditActivity;
import com.guzman.rotem.tamalsocialbank1.mother.MomUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class MomUserAdapter extends BaseAdapter {

    private ArrayList<MomUser> data;
    private Activity context;
    private String firstName;
    private String lastName;
    private String fullName;
    private String streetAndNumber;
    private String city;
    private String address;

    public MomUserAdapter(ArrayList<MomUser> data, Activity context) {
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

        @SuppressLint("ViewHolder")
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
                Gson gson = new Gson();
                String json = gson.toJson(momUser);
                Intent intent = new Intent(context, AdminMotherEditActivity.class);
                intent.putExtra("toEdit", json);
                context.startActivity(intent);
            }
        });

        btnDeleteMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DbUtil.deleteUser(momUser.get_id(), momUser.get_rev());
                context.finish();
                Intent intent = new Intent(context, AdminMotherActivity.class);
                context.startActivity(intent);
            }
        });


        return v;
    }
}
