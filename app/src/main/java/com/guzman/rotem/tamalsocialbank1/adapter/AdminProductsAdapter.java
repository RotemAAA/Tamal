package com.guzman.rotem.tamalsocialbank1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.Food;
import com.guzman.rotem.tamalsocialbank1.R;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class AdminProductsAdapter extends BaseAdapter{

    Context context;
    ArrayList<Food> data;

    public AdminProductsAdapter(ArrayList<Food> foods, Context context) {
        this.context = context;
        this.data = foods;
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

        Food food = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.admin_products_my_list, parent, false);

        ImageView ivFood = v.findViewById(R.id.ivFood);
        TextView tvHead = v.findViewById(R.id.tvHead);
        TextView tvDisc = v.findViewById(R.id.tvDisc);
        Button btnEditProduct = v.findViewById(R.id.btnEditPtoduct);
        Button btnDeleteProduct = v.findViewById(R.id.btnDeleteProduct);

        ivFood.setImageResource(food.getImgSrc());
        tvHead.setText(food.getName());
        tvDisc.setText(food.getDescription());

        btnEditProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: edit product on server
            }
        });

        btnDeleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: delete product from server
            }
        });

        return v;
    }
}
