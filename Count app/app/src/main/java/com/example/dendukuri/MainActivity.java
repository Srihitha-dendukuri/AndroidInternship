package com.example.dendukuri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    TextView tv;

    int Count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.Inc);
        b2 = findViewById(R.id.Dec);
        b3 = findViewById(R.id.Zero);
        tv = findViewById(R.id.textcount);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Count++;
                tv.setText("" + Count);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Count--;
                tv.setText("" + Count);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Count = 0;
                tv.setText("" + Count);

            }
        });


        if (savedInstanceState != null) {
            String s = savedInstanceState.getString("sri");
            Count = Integer.parseInt(s);
            tv.setText("" + Count);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("sri", tv.getText().toString());
    }

    public void display(View view) {
        Toast.makeText(this, "your count=" + Count, Toast.LENGTH_SHORT).show();
    }
}

