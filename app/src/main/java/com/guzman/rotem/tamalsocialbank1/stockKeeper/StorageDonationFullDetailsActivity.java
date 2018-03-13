package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageDonationFullDetailsActivity extends AppCompatActivity {

    private TextView tvSMDonationFullOrderDate, tvSMDonationFullOrderTime, tvSMDonationFullOrderNumer;
    private Button btnSMDonationFullCallDeliveryGuy, btnSMDonationFullAccept;
    private ListView lvSMDonationFullProductsDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_donation_full_details);



        tvSMDonationFullOrderDate = findViewById(R.id.tvSMDonationFullOrderDate);
        tvSMDonationFullOrderNumer = findViewById(R.id.tvSMDonationFullOrderNumber);
        tvSMDonationFullOrderTime = findViewById(R.id.tvSMDonationFullOrderTime);
        btnSMDonationFullCallDeliveryGuy = findViewById(R.id.btnSMDonationFullCallDeliveryGuy);
        btnSMDonationFullAccept = findViewById(R.id.btnSMDonationFullAccept);
        //TODO: ALL

        lvSMDonationFullProductsDetails = findViewById(R.id.lvSMDonationFullProductsDetails);
        //TODO: connect to: storage_manage_donation_full_details_my_list



    }
}
