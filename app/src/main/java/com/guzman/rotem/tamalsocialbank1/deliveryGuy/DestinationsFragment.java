package com.guzman.rotem.tamalsocialbank1.deliveryGuy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.DestinationDataSource;

/**
 * Created by tsuryohananov on 14/03/2018.
 */

public class DestinationsFragment extends Fragment {
    private Activity activity;

    public DestinationsFragment() {
    }

    public static DestinationsFragment newInstance(String jsonUser, int i) {
        Bundle args = new Bundle();
        DestinationsFragment fragment = new DestinationsFragment();
        args.putString("user", jsonUser);
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
        String json = (String) args.get("user");
        int donOrReq = args.getInt("don_req");
        Gson gson = new Gson();
        DeliveryUser dUser = gson.fromJson(json, DeliveryUser.class);
        listView = view.findViewById(R.id.listViewDestionations);
        switch (donOrReq) {
            case 0:
/*                ArrayList<Donation> dontations = gson.fromJson(dest, ArrayList.class);
                new DonationsDataSource(getActivity(), listView, 0);*/
                new DestinationDataSource(dUser, 0, ((Activity) getContext()), listView).execute();
                break;
            case 1:
/*                ArrayList<Request> requests = gson.fromJson(dest, ArrayList.class);
                new RequestsDataSource(getActivity(), listView, 1);*/
                new DestinationDataSource(dUser, 1, ((Activity) getContext()), listView).execute();
                break;
            default:
/*                ArrayList<Donation> dontations1 = gson.fromJson(dest, ArrayList.class);
                new DonationsDataSource(getActivity(), listView, 1);*/
                new DestinationDataSource(dUser, 0, ((Activity) getContext()), listView).execute();
                break;
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
