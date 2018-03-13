package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageRequestsInProccessActivity extends AppCompatActivity {

    private ListView lvRequestsInProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_requests_in_proccess);

        lvRequestsInProcess = findViewById(R.id.lvRequestsInProcess);

        //TODO: connect to: storage_manage_request_in_process_my_list
    }
}
