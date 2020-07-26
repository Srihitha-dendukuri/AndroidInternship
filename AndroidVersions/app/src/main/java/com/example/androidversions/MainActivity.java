package com.example.androidversions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler);
        int images[] = {R.drawable.alpha, R.drawable.beta, R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread
                , R.drawable.honeycomb, R.drawable.icecreamsandwich, R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow,
                R.drawable.nougat, R.drawable.oreo, R.drawable.pie, R.drawable.q, R.drawable.r};

        String names[] = {"NAME-alpha", "CODE NAME-beta", "CODE NAME-CupCake", "CODE NAME-Donut", "CODE NAME-Eclair", "CODE NAME-Froyo", "CODE NAME-Gingerbread", "CODE NAME-Honeycomb", "CODE NAME-Ice Cream Sandwich", "CODE NAME-Jelly Bean", "CODE NAME-KitKat", "CODE NAME-LolliPop", "CODE NAME-Marshmallow", "CODE NAME-Oreo", "CODE NAME-Oreo", "CODE NAME-Pie", "CODE NAME-Android 10"};
        String numbers[] = {"Version numbers-1.0", "Version numbers-1.1", "Version numbers-1.5", "Version numbers-1.6", "Version numbers-2.0-2.1", "Version numbers-2.2-2.2.3", "Version numbers-2.3-2.3.7", "Version numbers-3.0-3.2.6", "Version numbers-4.0-4.0.4", "Version numbers-4.1-4.3.1", "Version numbers-4.4-4.4.4", "Version numbers-5.0-5.1.1", "Version numbers-6.0-6.01", "Version numbers-7.0", "Version numbers-7.1.0-7.1.2", "Version numbers-8.0", "Version numbers-8.1", "Version numbers-9.0", "Version numbers-10.0"};
        String levels[] = {"API level- 1", "API level- 2", "API level- 3", "API level- 4", "API level- 5-7", "API level- 8", "API level- 9-10", "API level- 11-13", "API level- 14-15", "API level- 16-18", "API level- 19-20", "API level- 21-22", "API level- 23", "API level- 24", "API level- 25", "API level- 26", "API level- 27", "API level- 28", "API level- 29"};
        String dates[] = {"Release date:Sep-23-08", "Release date:Feb-9-09", "Release date:April-27-09", "Release date:Sep-15-09", "Release date:Oct-26-09", "Release date:May-20-10", "Release date:Dec-6-10", "Release date:Feb-22-11", "Release date:Oct-18-11", "Release date:July-9-12", "Release date:Oct-31-13", "Release date:Nov-12-14", "Release date:Oct-5-15", "Release date:Aug-22-16", "Release date:Oct-4-16", "Release date:Aug-21-17", "Release date:Dec-5-17", "Release date:Aug-6-18", "Release date:Sep-3-19"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this,images,names,numbers,levels,dates);
        rv.setAdapter(adapter);
    }
}