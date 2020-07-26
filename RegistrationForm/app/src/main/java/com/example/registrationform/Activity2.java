package com.example.registrationform;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.TextView;


public class Activity2 extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
       TextView tv = (TextView) findViewById(R.id.result);
        tv.setText ( "User Details:\n"+"Roll No.:\t"+getIntent ().getStringExtra ( "et_roll" )+"\n"+"Name:\t"+getIntent ().getStringExtra ( "et_name" )+
                "\n"+"Phone No.:\t"+getIntent ().getStringExtra ( "et_mobile" )+ "\n"+"Email:\t"+getIntent ().getStringExtra ( "et_email" )+
                "\n"+"Password:\t"+getIntent ().getStringExtra ( "et_pass" )+"\n"+"Gender:\t"+getIntent ().getStringExtra ( "gender" )+
                "\n"+"Branch:\t"+getIntent ().getStringExtra ( "branch" ));



    }
}








