package com.guzman.rotem.tamalsocialbank1.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.donor.Hour;

import java.util.ArrayList;

/**
 * Created by Rotem on 17/03/2018.
 */

public class HoursAdapter extends BaseAdapter {

    Activity context;
    ArrayList<Hour> data;

    public HoursAdapter(Activity context, ArrayList<Hour> data) {
        this.context = context;
        this.data = data;
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

        Hour hour = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        @SuppressLint("ViewHolder")
        View v = inflater.inflate(R.layout.hours_spinner_my_spinner, parent, false);

        TextView tvCallBackHours = v.findViewById(R.id.tvCallBackHours);

        tvCallBackHours.setText(hour.getHour());

        return v;
    }
}
