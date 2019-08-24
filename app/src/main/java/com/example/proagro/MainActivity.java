package com.example.proagro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView Milk,products,Medicines,fodder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Milk=(CardView) findViewById(R.id.milk);
        products=(CardView) findViewById(R.id.milk_products);
        Medicines=(CardView) findViewById(R.id.medicines);
        fodder=(CardView)findViewById(R.id.fodders);

        Milk.setOnClickListener(this);
        products.setOnClickListener(this);
        Medicines.setOnClickListener(this);
        fodder.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.milk:i = new Intent(this, Milk_Activity.class); startActivity(i);break;
            case R.id.milk_products:i = new Intent(this, Products_Activity.class);startActivity(i);break;
            case R.id.medicines:i = new Intent(this, Medicines_Activity.class);startActivity(i);break;
            case R.id.fodders:i = new Intent(this, Fodders_Activity.class);startActivity(i);break;
            default:break;


        }
    }
}
