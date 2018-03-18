package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.donor.MainDonorsActivity;
import com.guzman.rotem.tamalsocialbank1.donor.StoriesActivity;
import com.guzman.rotem.tamalsocialbank1.registration.RegestrationMainActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnFastDonation;
    private Button btnStories;
    private Button btnLogin;


    /*ArrayList<Supply> foods = new ArrayList<>();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
        final String dbUser = "tionsedgandidideperassio";
        final String dbPass = "4bf6f9c4478a6ee21689e348ea0d0cf83a2c8d9d";
        final String dbName = "inventory";


        foods.add(new Supply("מטרנה Extra Care", "שלב 1", "7290013083661", R.drawable.b7290013083661, 0));
        foods.add(new Supply("מטרנה Extra Care", "שלב 2", "7290013083678", R.drawable.b7290013083678, 0));
        foods.add(new Supply("מטרנה Extra Care", "שלב 3", "7290013083685", R.drawable.b7290013083685, 0));

        foods.add(new Supply("מטרנה Extra Care Comfort", "מגיל לידה ואילך", "7290014258914", R.drawable.b7290014258914, 0));
        foods.add(new Supply("מטרנה - חלבי", "שלב 1", "7290011447267", R.drawable.b7290011447267, 0));
        foods.add(new Supply("מטרנה - חלבי", "שלב 2", "7290011447281", R.drawable.b7290011447281, 0));
        foods.add(new Supply("מטרנה - חלבי", "שלב 3", "7290011447304", R.drawable.b7290011447304, 0));
        foods.add(new Supply("מטרנה - מהדרין", "שלב 1", "7290011447359", R.drawable.b7290011447359, 0));
        foods.add(new Supply("מטרנה - מהדרין", "שלב 2", "7290011447373", R.drawable.b7290011447373, 0));
        foods.add(new Supply("מטרנה - מהדרין", "שלב 3", "7290008975551", R.drawable.b7290008975551, 0));
        foods.add(new Supply("מטרנה-צמחי", "מגיל לידה ואילך", "7290014258716", R.drawable.b7290014258716, 0));
        foods.add(new Supply("מטרנה-צמחי", "מגיל 12 חודשים", "7290014258730", R.drawable.b7290014258730, 0));
        foods.add(new Supply("מטרנה-צמח", "מגיל 0 עד 12 חודשים", "7290014258723", R.drawable.b7290014258723, 0));
        foods.add(new Supply("פדיאשור", "מגיל שנה עד 10 שנים", "8710428021533", R.drawable.b8710428021533, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 1 - אריזה קטנה", "5099864004205", R.drawable.b5099864004205, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 1 - אריזה גדולה", "5099864006704", R.drawable.b5099864006704, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 2 - אריזה קטנה", "5099864006070", R.drawable.b5099864006070, 0));
        foods.add(new Supply("סימילאק-בטעם וניל", "שלב 2 - אריזה גדולה", "8427030005461", R.drawable.b8427030005461, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 2 - אריזה גדולה", "5099864006711", R.drawable.b5099864006711, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 2 - אריזה קטנה", "5099864006070", R.drawable.b5099864006070, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 3 - אריזה קטנה", "5099864005202", R.drawable.b5099864005202, 0));
        foods.add(new Supply("סימילאק-רגיל", "שלב 3 - אריזה גדולה", "5099864006728", R.drawable.b5099864006728, 0));
        foods.add(new Supply("סימילאק Spit-up Relief", "מגיל 0 עד 12 חודשים", "8427030005010", R.drawable.b8427030005010, 0));
        foods.add(new Supply("סימילאק - Isoil", "על בסיס חלבון סויה", "8710428005755", R.drawable.b8710428005755, 0));
        foods.add(new Supply("סימילאק - NeoSure", "פגים ומשקל לידה נמוך-מגיל 0 עד 12 חודשים", "8427030002699", R.drawable.b8427030002699, 0));
        foods.add(new Supply("נוטרילון - שלב 1", "אריזה קטנה", "8712400802482", R.drawable.b8712400802482, 0));
        foods.add(new Supply("נוטרילון - שלב 1", "אריזה גדולה", "8712400802499", R.drawable.b8712400802499, 0));
        foods.add(new Supply("נוטרילון - שלב 2", "אריזה קטנה", "8712400802505", R.drawable.b8712400802505, 0));

        foods.add(new Supply("נוטרילון - שלב 2", "אריזה גדולה", "8712400802512", R.drawable.b8712400802512, 0));
        foods.add(new Supply("נוטרילון - שלב 3", "אריזה גדולה", "8712400802536", R.drawable.b8712400802536, 0));
        foods.add(new Supply("נוטרילון קומפורט", "מגיל לידה ואילך", "7290110730109", R.drawable.b7290110730109, 0));

        foods.add(new Supply("סימילאק טופ", "אריזה גדולה", "5099864006773", R.drawable.b5099864006773, 0));

        foods.add(new Supply("סופרסל בייבי - Baby", "שלב 1", "7296073237440", R.drawable.b7296073237440, 0));
        foods.add(new Supply("סופרסל בייבי - Baby", "שלב 2", "7296073237457", R.drawable.b7296073237457, 0));
        foods.add(new Supply("סופרסל בייבי - Baby", "שלב 3", "7296073237464", R.drawable.b7296073237464, 0));


        for (Supply food : foods) {
            DbUtil.writeToDb(this, dbAcnt, dbUser, dbPass, dbName, food);
        }*/


        btnFastDonation = findViewById(R.id.btnFastDonation);

        btnStories = findViewById(R.id.btnStories);


        btnLogin = findViewById(R.id.btnLogin);

        btnStories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StoriesActivity.class);
                intent.putExtra("url", "https://www.2help.org.il/forum/dvyvt-mmhvt");
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegestrationMainActivity.class);
                startActivity(intent);
            }
        });

        btnFastDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainDonorsActivity.class);
                startActivity(intent);
            }
        });

    }


}
