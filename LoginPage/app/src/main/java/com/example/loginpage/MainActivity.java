package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_1,et_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1=findViewById(R.id.login_Email);
        et_2=findViewById(R.id.login_pass);
    }

    public void login(View view) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    public void signup(View view) {
        Intent i = new Intent(this,RegistrationActivity.class);
        startActivity(i);
    }
}