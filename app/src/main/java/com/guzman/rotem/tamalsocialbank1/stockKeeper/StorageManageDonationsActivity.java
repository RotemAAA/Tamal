package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageManageDonationsActivity extends AppCompatActivity {

    private ListView lvManageDonations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_donations);

        lvManageDonations = findViewById(R.id.lvManageDonations);
        //TODO: get donations from server, populate the listview
    }
}
