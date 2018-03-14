package com.guzman.rotem.tamalsocialbank1.deliveryGuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;

import java.util.ArrayList;

public class DeliveryGuyDestionations extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    private DeliveryUser dUser;
    private String json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_guy_destionations);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


        //get intent extra's with the delivery user json
        Intent intent = getIntent();
        json = intent.getStringExtra("user");
        //TODO: populate the listview (maybe we need 2). the ware house manager will update his arraylist with destinations
        // it means the wh manager will take a donation for ex and change it status and push it to the wanted delivery guy's arraylist of destinations

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_delivery_guy_destionations, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Gson gson = new Gson();
            dUser = gson.fromJson(json, DeliveryUser.class);
            String des = "";
            int i= 0;
            try {
                if (position == 0) {
                    ArrayList<Donation> donations = dUser.getDonations();
                    des = gson.toJson(donations);
                } else {
                    ArrayList<Request> requests = dUser.getRequests(); // arraylists for destinations
                    des = gson.toJson(requests);
                }

            } catch (Exception e) {
                Log.d("No Destinations", "No Destinations");

                // some textview that says "no destinations"
            }
            return DestinationsFragment.newInstance(des, i);

        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }
    }
}
