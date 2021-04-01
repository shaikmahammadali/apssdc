package com.example.myrecyclerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.MyViewHolder> {
    Context ctx;
    String title[],sub_title[];
    int poster[];
    public myadapter(Context ctx ,String title[],String sub_title[],int poster[]) {
        this.ctx = ctx;
        this.title=title;
        this.sub_title=sub_title;
        this.poster=poster;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.row_design,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.t.setText(title[position]);
        holder.st.setText(sub_title[position]);
        holder.img.setImageResource(poster[position]);

    }

    @Override
    public int getItemCount() {

        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t,st;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t=itemView.findViewById(R.id.tv_title);
            st=itemView.findViewById(R.id.tv_subtitle);
            img=itemView.findViewById(R.id.iv);
        }
    }
}
