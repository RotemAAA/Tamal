package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.adapter.AdminProductsAdapter;
import com.guzman.rotem.tamalsocialbank1.dataSource.FoodDataSource;

public class AdminProductsActivity extends AppCompatActivity {

    private ListView lvProducts;
    private Button btnAddNewProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_products);

        btnAddNewProduct = findViewById(R.id.btnAddNewProduct);
        lvProducts = findViewById(R.id.lvProducts);

        btnAddNewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminProductsActivity.this, AdminProductEditActivity.class);
                startActivity(intent);
            }
        });

        AdminProductsAdapter adminProductsAdapter = new AdminProductsAdapter(FoodDataSource.getData(), this);
        lvProducts.setAdapter(adminProductsAdapter);
    }
}
