package com.example.androidversions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int myImages[];
    String myNames[];
    String myNumbers[];
    String myLevel[];
    String myDate[];
    Context ct;



    public MyAdapter(MainActivity mainActivity, int[] images, String[] names,String[] numbers,String[] levels,String[] dates) {
        myImages=images;
        myNames=names;
        myNumbers=numbers;
        myLevel=levels;
        myDate=dates;
        ct=mainActivity;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(ct).inflate(R.layout.item,parent,false);
        MyViewHolder MyViewHolder=new MyViewHolder(v);
        return MyViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv1.setText(myNames[position]);
        holder.tv2.setText(myNumbers[position]);
        holder.tv3.setText(myLevel[position]);
        holder.tv4.setText(myDate[position]);




    }

    @Override
    public int getItemCount() {

        return 19;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv1,tv2,tv3,tv4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.poster);
            tv1=itemView.findViewById(R.id.postername);
            tv2=itemView.findViewById(R.id.posternumber);
            tv3=itemView.findViewById(R.id.posterlevel);
            tv4=itemView.findViewById(R.id.posterdate);
        }
    }
}

