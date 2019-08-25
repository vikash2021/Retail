package com.example.proagro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Order_Activity extends AppCompatActivity implements View.OnClickListener{

    public CardView search,order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_);


        search=(CardView) findViewById(R.id.searchOutlet);
        order=(CardView) findViewById(R.id.finalOrder);

        search.setOnClickListener(this);
        order.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.searchOutlet:i = new Intent(this, Map_Activity.class); startActivity(i);break;
            case R.id.finalOrder:i = new Intent(this, FinalOrder_Activity.class);startActivity(i);break;

            default:break;


        }

    }
}
