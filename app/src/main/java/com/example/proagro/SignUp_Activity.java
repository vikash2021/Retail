package com.example.proagro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp_Activity extends AppCompatActivity {

    public   EditText editText1;
    public   EditText editText2;
    public   EditText editText3;
    public   EditText editText4;
    public   EditText editText5;
    public   EditText editText6;
    public   EditText editText7;
    public   EditText editText8;
    public   EditText editText9;
    public   EditText editText10;
    public   EditText editText11;
    public   Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        editText1 = (EditText)findViewById(R.id.t1);
        editText2 = (EditText)findViewById(R.id.t2);
        editText3 = (EditText)findViewById(R.id.t3);
        editText4 = (EditText)findViewById(R.id.t4);
        editText5 = (EditText)findViewById(R.id.t5);
        editText6 = (EditText)findViewById(R.id.t6);
        editText7 = (EditText)findViewById(R.id.t7);
        editText8 = (EditText)findViewById(R.id.t8);
        editText9 = (EditText)findViewById(R.id.t9);
        editText10 = (EditText)findViewById(R.id.t10);
        editText11= (EditText)findViewById(R.id.t11);
        button    = (Button)findViewById(R.id.b1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), Login_Activity.class));

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(SignUp_Activity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                        editText1.setText("");
                        editText2.setText("");
                        editText3.setText("");
                        editText4.setText("");
                        editText5.setText("");
                        editText6.setText("");
                        editText7.setText("");
                        editText8.setText("");
                        editText9.setText("");
                        editText10.setText("");
                        editText11.setText("");
                        startActivity(new Intent(getApplicationContext(), Login_Activity.class));

                    }
                }, 1000);


            }


        });
    }
}
