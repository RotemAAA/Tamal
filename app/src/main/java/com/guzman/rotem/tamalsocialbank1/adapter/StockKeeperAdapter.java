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
import com.guzman.rotem.tamalsocialbank1.admin.AdminStockKeeperActivity;
import com.guzman.rotem.tamalsocialbank1.admin.AdminStockKeeperEditActivity;
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StockKeeperUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class StockKeeperAdapter extends BaseAdapter {

    private ArrayList<StockKeeperUser> data;
    private Activity context;
    private String firstName;
    private String lastName;
    private String fullName;

    public StockKeeperAdapter(ArrayList<StockKeeperUser> data, Activity context) {
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

        final StockKeeperUser stockKeeperUser = data.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
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
                Gson gson = new Gson();
                String json = gson.toJson(stockKeeperUser);
                Intent intent = new Intent(context, AdminStockKeeperEditActivity.class);
                intent.putExtra("toEdit", json);
                context.startActivity(intent);
            }
        });

        btnDeleteStockKeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbUtil.deleteUser(stockKeeperUser.get_id(), stockKeeperUser.get_rev());
                context.finish();
                Intent intent = new Intent(context, AdminStockKeeperActivity.class);
                context.startActivity(intent);
            }
        });


        return v;
    }
}
