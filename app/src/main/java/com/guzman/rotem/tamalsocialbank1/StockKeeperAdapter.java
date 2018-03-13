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

public class StockKeeperAdapter extends BaseAdapter{

    private ArrayList<StockKeeperUser> data;
    private Context context;
    private String firstName;
    private String lastName;
    private String fullName;

    public StockKeeperAdapter(ArrayList<StockKeeperUser> data, Context context) {
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

        StockKeeperUser stockKeeperUser = data.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);

       View v = inflater.inflate(R.layout.admin_manage_stock_keepers_my_list, parent, false);

        TextView tvStockKeeperName = v.findViewById(R.id.tvStockKeeperName);
        Button btnEditStockKeeper = v.findViewById(R.id.btnEditStockKeeper);
        Button btnDeleteStockKeeper = v.findViewById(R.id.btnDeleteStockKeeper);

        firstName = stockKeeperUser.getFirstName();
        lastName = stockKeeperUser.getLastName();
        fullName = firstName + " " + lastName;

        tvStockKeeperName.setText(fullName);

        btnEditStockKeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: edit stock keeper
            }
        });

        btnDeleteStockKeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: delete stock keeper
            }
        });


        return v;
    }
}
