package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    EditText et_1,et_2,et_3,et_4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        et_1=findViewById(R.id.reg_name);
        et_2=findViewById(R.id.reg_email);
        et_3=findViewById(R.id.reg_pass);
        et_4=findViewById(R.id.reg_phone);
        b1=findViewById(R.id.reg_button);
    }
}