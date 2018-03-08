package com.guzman.rotem.tamalsocialbank1;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

public class StorageManageRequestsActivity extends AppCompatActivity {

    private ListView lvNewRequests, lvProccessRquests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_requests);

        lvNewRequests = findViewById(R.id.lvNewRequests);
        //TODO: connect to: storage_manage_request_new_my_list

        lvProccessRquests = findViewById(R.id.lvInProccessRequests);
        //TODO: connect to: storage_manage_request_new_my_list
    }
}
