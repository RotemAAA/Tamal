package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.guzman.rotem.tamalsocialbank1.R;

public class ScanBarcodeActivity extends AppCompatActivity implements OnClickListener {

    private Button scanBtn;
//    private TextView formatTxt, contentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_barcode);

        scanBtn = (Button)findViewById(R.id.btnScanBarcode);
//        formatTxt = (TextView)findViewById(R.id.scan_format);
//        contentTxt = (TextView)findViewById(R.id.scan_content);
        scanBtn.setOnClickListener(this);
    }
    public void onClick(View v){
//respond to clicks
        if(v.getId()==R.id.btnScanBarcode){
//scan
            IntentIntegrator scanIntegrator = new IntentIntegrator(this);
            scanIntegrator.initiateScan();
        }
    }
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//retrieve scan result
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
//we have a result
            String scanContent = scanningResult.getContents();
            String scanFormat = scanningResult.getFormatName();
//            formatTxt.setText("FORMAT: " + scanFormat);
//            contentTxt.setText("CONTENT: " + scanContent);

            //TODO: USE SCANS


        }else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
