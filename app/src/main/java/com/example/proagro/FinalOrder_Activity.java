package com.example.proagro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class FinalOrder_Activity extends AppCompatActivity {

    EditText milkAmount,mobileNumber,Add1,Add2;
    CheckBox checkBox; Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_order_);

        milkAmount=(EditText)findViewById(R.id.am1);
       mobileNumber=(EditText)findViewById(R.id.am2);
        Add1=(EditText)findViewById(R.id.am3);
        Add2=(EditText)findViewById(R.id.am4);
        checkBox=(CheckBox)findViewById(R.id.cb1);
        button=(Button)findViewById(R.id.btn2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int str1=Integer.parseInt(milkAmount.getText().toString());
                final String str2 = mobileNumber.getText().toString();
                final String str3 = Add1.getText().toString();
                final String str4 = Add2.getText().toString();



                if (str1<=2)

                {

                    Toast.makeText(FinalOrder_Activity.this, "Please visit our nearby outlets", Toast.LENGTH_SHORT).show();
                    milkAmount.setText("");
                    mobileNumber.setText("");
                    Add1.setText("");
                    Add2.setText("");
                    startActivity(new Intent(getApplicationContext(), Order_Activity.class));


                }
                else
                {
                    milkAmount.setText("");
                    mobileNumber.setText("");
                    Add1.setText("");
                    Add2.setText("");
                    startActivity(new Intent(getApplicationContext(),OrderConfirmation.class));
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(getApplicationContext(), Order_Activity.class));

                        }
                    }, 2000);

                }


            }
        });

    }
}
