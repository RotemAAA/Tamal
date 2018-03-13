package com.guzman.rotem.tamalsocialbank1;

        import android.content.Intent;
        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;

public class StorageManageRequestsActivity extends AppCompatActivity {

    private Button btnRequestsNew, btnRequestsInProcess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_requests);

        btnRequestsNew = findViewById(R.id.btnRequestsNew);
        btnRequestsInProcess = findViewById(R.id.btnRequestsInProcess);

        btnRequestsInProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageManageRequestsActivity.this, StorageRequestsInProccessActivity.class);
                startActivity(intent);
            }
        });

        btnRequestsNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageManageRequestsActivity.this, StorageRequestsNewActivity.class);
                startActivity(intent);
            }
        });

    }
}
