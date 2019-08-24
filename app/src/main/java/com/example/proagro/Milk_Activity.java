package com.example.proagro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Milk_Activity extends AppCompatActivity implements View.OnClickListener {
    public CardView purMilk,sellMilk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_);

        purMilk=(CardView) findViewById(R.id.purchase_milk);
        sellMilk=(CardView) findViewById(R.id.sell_milk);

        purMilk.setOnClickListener(this);
        sellMilk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.purchase_milk:i = new Intent(this, Login_Activity.class); startActivity(i);break;
            case R.id.sell_milk:i = new Intent(this, SignUp_Activity.class);startActivity(i);break;

            default:break;


        }
    }
}
