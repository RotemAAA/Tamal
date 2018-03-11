package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AdminMotherActivity extends AppCompatActivity {

    private Button btnAddMother;
    private ListView lvMothers;

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mother);

        DbUtil.readFromDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName);

        btnAddMother = findViewById(R.id.btnAddMother);


        lvMothers = findViewById(R.id.lvMothers);
        //TODO: connect to admin_manage_mother_my_list

/*        ArrayList<User> users = DbUtil.getUserArrayList();
        ArrayList<MomUser> moms = new ArrayList<>();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getRole().equals("Mother")) {
                moms.add((MomUser) users.get(i));
            }
        }
        MotherListAdapter motherListAdapter = new MotherListAdapter(moms, getApplicationContext());
        lvMothers.setAdapter(motherListAdapter);*/

        btnAddMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMotherActivity.this, AdminMotherEditActivity.class);
                startActivity(intent);
/*                ArrayList<User> users = DbUtil.getUserArrayList();
                ArrayList<MomUser> moms = new ArrayList<>();

                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i) .getRole().equals("Mother")) {
                        //moms.add(users.get(i));
                        Log.d("BLALBALBLAB", users.get(i).toString());
                    }
                }
                MotherListAdapter motherListAdapter = new MotherListAdapter(moms, getApplicationContext());
                lvMothers.setAdapter(motherListAdapter);*/
            }
        });
    }
}
