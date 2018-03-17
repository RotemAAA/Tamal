package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.RequestsDataSource;

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
    ListView listView;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        listView = view.findViewById(R.id.donationsLV);
        // go to requests data source and populate the right type of donations (switch position)
        Bundle args = getArguments();
        int pos = args.getInt("pos"); // 0 - new , 1 - processing , 2  - done

        switch (pos) {
            case 0:
                new RequestsDataSource(getContext(), listView, 0).execute();
                break;
            case 1:
                new RequestsDataSource(getContext(), listView, 1).execute();
                break;
            case 2:
                new RequestsDataSource(getContext(), listView, 2).execute();
                break;
            default:
                new RequestsDataSource(getContext(), listView, 0).execute();
                break;
        }
    }
}
