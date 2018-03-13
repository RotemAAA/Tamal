package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class StorageRequestsNewActivity extends AppCompatActivity {

    private ListView lvRequestsNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_requests_new);

        lvRequestsNew = findViewById(R.id.lvRequestsNew);

        //TODO: connect to: storage_manage_request_new_my_list
    }
}
