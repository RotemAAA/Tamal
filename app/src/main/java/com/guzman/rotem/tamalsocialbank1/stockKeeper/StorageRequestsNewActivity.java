package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageRequestsNewActivity extends AppCompatActivity {

    private ListView lvRequestsNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_requests_new);

        lvRequestsNew = findViewById(R.id.lvRequestsNew);
        //TODO: get all the requests from the server, then -
        //TODO: connect to: storage_manage_request_new_my_list
    }
}
