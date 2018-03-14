package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Supply;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class SupplyAdapter extends BaseAdapter {

    private ArrayList<Supply> data;
    private Context context;

    public SupplyAdapter(ArrayList<Supply> data, Context context) {
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

        Supply supply = data.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.storage_manage_inventory_my_list, parent, false);

        TextView tvFoodName = v.findViewById(R.id.tvFoodeName);
        TextView tvNumberInInventory = v.findViewById(R.id.tvNumberInInventory);
        ImageView ivFoodType = v.findViewById(R.id.ivFoodType);

        String s = (supply.getInInventory()) + "";

        tvFoodName.setText(supply.getFoodName());
        tvNumberInInventory.setText(s);


        return v;
    }
}
