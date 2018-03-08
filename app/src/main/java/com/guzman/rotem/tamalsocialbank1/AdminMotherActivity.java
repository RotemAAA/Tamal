package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AdminMotherActivity extends AppCompatActivity {

    private Button btnAddMother;
    private ListView lvMothers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mother);

        btnAddMother = findViewById(R.id.btnAddMother);


        lvMothers = findViewById(R.id.lvMothers);
        //TODO: connect to admin_manage_mother_my_list

        btnAddMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMotherActivity.this, AdminMotherEditActivity.class);
                startActivity(intent);
            }
        });
    }
}
