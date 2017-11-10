package com.example.validation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    private EditText et_notEmpty, et_or1, et_or2, et_email, et_password1, et_password2, et_url;
    private Button btn_ok;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ok = (Button) findViewById(R.id.btn_ok);
        et_notEmpty = (EditText) findViewById(R.id.et_notEmpty);
        et_or1 = (EditText) findViewById(R.id.et_or1);
        et_or2 = (EditText) findViewById(R.id.et_or2);
        et_email = (EditText) findViewById(R.id.et_email);
        et_password1 = (EditText) findViewById(R.id.et_password1);
        et_password2 = (EditText) findViewById(R.id.et_password2);
        et_url = (EditText) findViewById(R.id.et_url);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }


}
