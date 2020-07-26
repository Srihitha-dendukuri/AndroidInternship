package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_roll,et_name,et_mobile,et_email,et_pass;

   RadioButton ch_cse,ch_ece,ch_eee,ch_civil,ch_mech,r_male,r_female;

    String gender,branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_roll=findViewById(R.id.rollno);
        et_name = findViewById(R.id.name);
        et_mobile = findViewById(R.id.number);
        et_email = findViewById(R.id.emailid);
        et_pass = findViewById(R.id.password);
        r_male = (RadioButton)findViewById(R.id.male);
        r_female = (RadioButton)findViewById(R.id.female);
        ch_cse = (RadioButton)findViewById(R.id.cse);
        ch_ece =(RadioButton) findViewById(R.id.ece);
        ch_eee = (RadioButton)findViewById(R.id.eee);
        ch_civil = (RadioButton)findViewById(R.id.civil);
        ch_mech = (RadioButton)findViewById(R.id.mech);


    }

    public void submit(View view) {

        if(r_male.isChecked()){
            gender = r_male.getText().toString();
        }
        if(r_female.isChecked()){
            gender = r_female.getText().toString();
        }

        if(ch_cse.isChecked()){
           branch=(ch_cse.getText().toString()+",");
        }
        if(ch_ece.isChecked()){
            branch=(ch_ece.getText().toString()+",");
        }
        if(ch_eee.isChecked()){
            branch=(ch_eee.getText().toString()+",");
        }
        if(ch_civil.isChecked()){
            branch=(ch_civil.getText().toString()+",");
        }
        if(ch_mech.isChecked()){
           branch=(ch_mech.getText().toString()+",");
        }
        if(!et_roll.getText ().toString ().equals ( "" ) && !et_name.getText ().toString ().equals ( "" ) && !et_email.getText ().toString ().equals ( "" ) &&
                !et_mobile.getText ().toString ().equals ( "" ) && !et_pass.getText ().toString ().equals ( "" )){
            Intent i = new Intent( getApplicationContext (),Activity2.class );
            i.putExtra ( "rollNo",et_roll.getText ().toString () );
            i.putExtra ( "name",et_name.getText ().toString () );
            i.putExtra ( "phone",et_mobile.getText ().toString () );
            i.putExtra ( "email",et_email.getText ().toString () );
            i.putExtra ( "pass",et_pass.getText ().toString ());
            i.putExtra ( "gender",gender );
            i.putExtra ( "language",branch);

            startActivity ( i );
        }
        else{
            Toast.makeText ( this, "Please fill the above details", Toast.LENGTH_SHORT ).show ();
        }



    }
}