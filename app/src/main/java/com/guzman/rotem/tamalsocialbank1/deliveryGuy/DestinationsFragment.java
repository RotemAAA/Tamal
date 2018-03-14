package com.guzman.rotem.tamalsocialbank1.deliveryGuy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 14/03/2018.
 */

public class DestinationsFragment extends Fragment {

    public DestinationsFragment() {
    }

    public static DestinationsFragment newInstance(String destinations, int i) {

        Bundle args = new Bundle();
        DestinationsFragment fragment = new DestinationsFragment();
        args.putString("destinations", destinations);
        args.putInt("don_req", i);
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_destinations, container, false);
    }

    private ListView listView;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //get the destinations:
        Bundle args = getArguments();
        String dest = (String) args.get("donations");
        int donOrReq = args.getInt("don_req");
        Gson gson = new Gson();
        switch (donOrReq) {
            case 0:
                ArrayList<Donation> dontations = gson.fromJson(dest, ArrayList.class);
                break;
            case 1:
                ArrayList<Request> requests = gson.fromJson(dest, ArrayList.class);
                break;
            default:
                ArrayList<Donation> dontations1 = gson.fromJson(dest, ArrayList.class);
                break;
        }
        listView = view.findViewById(R.id.listViewDestionations);

        //TODO: adapter for donations / requests!!!
    }
}
