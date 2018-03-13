package com.guzman.rotem.tamalsocialbank1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.mother.MomUser;
import com.guzman.rotem.tamalsocialbank1.R;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 11/03/2018.
 */

public class MotherListAdapter extends BaseAdapter {
    private ArrayList<MomUser> moms;
    private LayoutInflater inflater;
    private Context context;

    public MotherListAdapter(ArrayList<MomUser> moms, Context context) {
        this.moms = moms;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 0;
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
        View itemView = convertView;
        itemView = (itemView == null) ? inflater.inflate(R.layout.admin_manage_mother_my_list, null) : itemView;
        TextView adrs = itemView.findViewById(R.id.tvMotherAddress);
        TextView name = itemView.findViewById(R.id.tvSMNewRequestMotherName);

        MomUser momUser = moms.get(position);

        adrs.setText(momUser.getStreetNumber());
        name.setText(momUser.getFirstName() + " " + momUser.getLastName());

        return itemView;
    }
}
