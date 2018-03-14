package com.guzman.rotem.tamalsocialbank1.deliveryGuy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.guzman.rotem.tamalsocialbank1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DonationsListFragment extends Fragment {


    public DonationsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_donations_list, container, false);
    }

}
