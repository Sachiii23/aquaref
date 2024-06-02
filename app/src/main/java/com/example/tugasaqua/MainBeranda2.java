package com.example.tugasaqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainBeranda2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_2);
    }

    public void redeem(View view){
        Intent intent = new Intent(MainBeranda2.this, Main_redeemvgkatalog.class);
        startActivity(intent );
    }

    public void extra(View view){
        Intent intent = new Intent(MainBeranda2.this, Main_undian_evg.class);
        startActivity(intent );
    }
}