package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.guzman.rotem.tamalsocialbank1.dataSource.SupplyDataSource;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.adapter.SupplyAdapter;

public class StorageManageInventoryActivity extends AppCompatActivity {

    private Button btnAddByBarcode;
    private ListView lvInventory;
    private TextView formatTxt, contentTxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_inventory);

        btnAddByBarcode = findViewById(R.id.btnAddByBarcode);
       /* formatTxt = (TextView)findViewById(R.id.scan_format);
        contentTxt = (TextView)findViewById(R.id.scan_content);*/
        lvInventory = findViewById(R.id.lvInventory);



        SupplyAdapter supplyAdapter = new SupplyAdapter(SupplyDataSource.getData(), this);
        lvInventory.setAdapter(supplyAdapter);




    }
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//retrieve scan result
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
//we have a result
            String scanContent = scanningResult.getContents();
            String scanFormat = scanningResult.getFormatName();
           /* formatTxt.setText("FORMAT: " + scanFormat);
            contentTxt.setText("CONTENT: " + scanContent);*/

            //TODO: USE SCANS


        }else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
