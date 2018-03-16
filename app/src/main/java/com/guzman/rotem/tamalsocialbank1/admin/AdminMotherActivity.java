package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.MomUserDataSource;

public class AdminMotherActivity extends AppCompatActivity {

    private Button btnAddMother;
    private ListView lvMothers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mother);

        btnAddMother = findViewById(R.id.btnAddMother);
        lvMothers = findViewById(R.id.lvMothers);

        new MomUserDataSource(lvMothers, this).execute();

        btnAddMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMotherActivity.this, AdminMotherEditActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPostResume() {
        new MomUserDataSource(lvMothers, this).execute();
        super.onPostResume();
    }
}
