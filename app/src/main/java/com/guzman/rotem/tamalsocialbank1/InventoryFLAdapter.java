package com.guzman.rotem.tamalsocialbank1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class InventoryFLAdapter extends BaseAdapter {

    private ArrayList<InventoryFL> data;
    private Context context;

    public InventoryFLAdapter(ArrayList<InventoryFL> data, Context context) {
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

        InventoryFL inventoryFL = data.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.storage_manage_inventory_my_list, parent, false);

        TextView tvFoodName = v.findViewById(R.id.tvFoodeName);
        TextView tvNumberInInventory = v.findViewById(R.id.tvNumberInInventory);
        ImageView ivFoodType = v.findViewById(R.id.ivFoodType);

        String s = (inventoryFL.getNumInInventory()) + "";

        tvFoodName.setText(inventoryFL.getFoodType());
        tvNumberInInventory.setText(s);




        return v;
    }
}
