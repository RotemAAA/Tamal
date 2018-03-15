package com.guzman.rotem.tamalsocialbank1.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.Food;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.donor.ChoosePickup;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 03/03/2018.
 */

public class FoodAdapter extends BaseAdapter {

    Activity context;
    ArrayList<Food> foods;
    private LayoutInflater inflater = null;

    public FoodAdapter(Activity context, ArrayList<Food> foods) {
        this.context = context;
        this.foods = foods;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public Object getItem(int position) {
        return foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        itemView = (itemView == null) ? inflater.inflate(R.layout.food_list_layout, null) : itemView;

        TextView tvName = itemView.findViewById(R.id.headtext);
        TextView tvDesc = itemView.findViewById(R.id.disctext);
        ImageView foodImage = itemView.findViewById(R.id.image);
        Food currentFood = foods.get(position);
        tvName.setText(currentFood.getName());
        tvDesc.setText(currentFood.getDescription());
        foodImage.setImageResource(currentFood.getImgSrc());


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Food f = foods.get(position);
                Gson gson = new Gson();
                String json = gson.toJson(f);
                Intent intent = new Intent(context, ChoosePickup.class);
                intent.putExtra("chosen_food", json);
                context.startActivity(intent);
            }
        });

        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                alertDialog.setTitle("בחר כמות");
                alertDialog.setMessage("Enter Password");

                final EditText input = new EditText(context);

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);

                alertDialog.show();

                return false;
            }
        });

        return itemView;
    }


}
