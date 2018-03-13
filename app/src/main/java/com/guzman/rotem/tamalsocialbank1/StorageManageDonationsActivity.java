package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class StorageManageDonationsActivity extends AppCompatActivity {

    private ListView lvManageDonations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_donations);

        lvManageDonations = findViewById(R.id.lvManageDonations);
        //TODO: arrange: storage_manage_donation_my_list, and than connect it...
    }
}
