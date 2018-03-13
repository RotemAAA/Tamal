package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.Food;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.adapter.FoodAdapter;

import java.util.ArrayList;

public class PickProductsFromList extends AppCompatActivity {

    private Button btnPickDropoffPoint;
    private ListView foodListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_products_from_list);

        foodListView = findViewById(R.id.lvProducts);
        btnPickDropoffPoint = findViewById(R.id.btnPickDropoffPoint);

        Food food = new Food("מטרנה Extra Care Comfort", "תמ\"ל דל לקטוז והיחיד מסוגו המכיל פרוביוטיקה מסוג לקטובצילוס ראוטרי", 0);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(food);

        FoodAdapter foodAdapter = new FoodAdapter(this, foods);

        foodListView.setAdapter(foodAdapter);

        btnPickDropoffPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PickProductsFromList.this, ChoosePickup.class);
                startActivity(intent);
            }
        });
    }
}

