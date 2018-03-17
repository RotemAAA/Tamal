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


    /*ArrayList<Food> foods = new ArrayList<>();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
        final String dbUser = "tsmandereeprownwastedits";
        final String dbPass = "740918fb3ecb293aef7fa749b895a7bb103a3557";
        final String dbName = "products";


        foods.add(new Food("מטרנה Extra Care", "שלב 1","7290013083661", R.drawable.b7290013083661));
        foods.add(new Food("מטרנה Extra Care", "שלב 2","7290013083678", R.drawable.b7290013083678));
        foods.add(new Food("מטרנה Extra Care", "שלב 3","7290013083685", R.drawable.b7290013083685));
        foods.add(new Food("מטרנה Extra Care Comfort", "מגיל לידה ואילך","7290014258914", R.drawable.b7290014258914));
        foods.add(new Food("מטרנה - חלבי", "שלב 1","7290011447267", R.drawable.b7290011447267));
        foods.add(new Food("מטרנה - חלבי", "שלב 2","7290011447281", R.drawable.b7290011447281));
        foods.add(new Food("מטרנה - חלבי", "שלב 3","7290011447304", R.drawable.b7290011447304));
        foods.add(new Food("מטרנה - מהדרין", "שלב 1","7290011447359", R.drawable.b7290011447359));
        foods.add(new Food("מטרנה - מהדרין", "שלב 2","7290011447373", R.drawable.b7290011447373));
        foods.add(new Food("מטרנה - מהדרין", "שלב 3","7290008975551", R.drawable.b7290008975551));
        foods.add(new Food("מטרנה-צמחי", "מגיל לידה ואילך","7290014258716", R.drawable.b7290014258716));
        foods.add(new Food("מטרנה-צמחי", "מגיל 12 חודשים","7290014258730", R.drawable.b7290014258730));
        foods.add(new Food("מטרנה-צמח", "מגיל 0 עד 12 חודשים","7290014258723", R.drawable.b7290014258723));
        foods.add(new Food("פדיאשור", "מגיל שנה עד 10 שנים","8710428021533", R.drawable.b8710428021533));
        foods.add(new Food("סימילאק-רגיל", "שלב 1 - אריזה קטנה","5099864004205", R.drawable.b5099864004205));
        foods.add(new Food("סימילאק-רגיל", "שלב 1 - אריזה גדולה","5099864006704", R.drawable.b5099864006704));
        foods.add(new Food("סימילאק-רגיל", "שלב 2 - אריזה קטנה","5099864006070", R.drawable.b5099864006070));
        foods.add(new Food("סימילאק-בטעם וניל", "שלב 2 - אריזה גדולה","8427030005461", R.drawable.b8427030005461));
        foods.add(new Food("סימילאק-רגיל", "שלב 2 - אריזה גדולה","5099864006711", R.drawable.b5099864006711));
        foods.add(new Food("סימילאק-רגיל", "שלב 2 - אריזה קטנה","5099864006070", R.drawable.b5099864006070));
        foods.add(new Food("סימילאק-רגיל", "שלב 3 - אריזה קטנה","5099864005202", R.drawable.b5099864005202));
        foods.add(new Food("סימילאק-רגיל", "שלב 3 - אריזה גדולה","5099864006728", R.drawable.b5099864006728));
        foods.add(new Food("סימילאק Spit-up Relief", "מגיל 0 עד 12 חודשים","8427030005010", R.drawable.b8427030005010));
        foods.add(new Food("סימילאק - Isoil", "על בסיס חלבון סויה","8710428005755", R.drawable.b8710428005755));
        foods.add(new Food("סימילאק - NeoSure", "פגים ומשקל לידה נמוך-מגיל 0 עד 12 חודשים","8427030002699", R.drawable.b8427030002699));
        foods.add(new Food("נוטרילון - שלב 1", "אריזה קטנה","8712400802482", R.drawable.b8712400802482));
        foods.add(new Food("נוטרילון - שלב 1", "אריזה גדולה","8712400802499", R.drawable.b8712400802499));
        foods.add(new Food("נוטרילון - שלב 2", "אריזה קטנה","8712400802505", R.drawable.b8712400802505));

        foods.add(new Food("נוטרילון - שלב 2", "אריזה גדולה","8712400802512", R.drawable.b8712400802512));
        foods.add(new Food("נוטרילון - שלב 3", "אריזה גדולה","8712400802536", R.drawable.b8712400802536));
        foods.add(new Food("נוטרילון קומפורט", "מגיל לידה ואילך","7290110730109", R.drawable.b7290110730109));

        foods.add(new Food("סימילאק טופ", "אריזה גדולה","5099864006773", R.drawable.b5099864006773));

        foods.add(new Food("סופרסל בייבי - Baby", "שלב 1","7296073237440", R.drawable.b7296073237440));
        foods.add(new Food("סופרסל בייבי - Baby", "שלב 2","7296073237457", R.drawable.b7296073237457));
        foods.add(new Food("סופרסל בייבי - Baby", "שלב 3","7296073237464", R.drawable.b7296073237464));


        for (Food food : foods) {
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
