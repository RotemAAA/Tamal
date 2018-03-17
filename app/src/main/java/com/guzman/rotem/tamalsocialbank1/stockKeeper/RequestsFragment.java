package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.guzman.rotem.tamalsocialbank1.R;

/**
 * Created by tsuryohananov on 17/03/2018.
 */

public class RequestsFragment extends Fragment {

    public static RequestsFragment newInstance(int i) {

        Bundle args = new Bundle();
        args.putInt("pos", i);
        RequestsFragment fragment = new RequestsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_donations_manage, container, false);
    }


}
