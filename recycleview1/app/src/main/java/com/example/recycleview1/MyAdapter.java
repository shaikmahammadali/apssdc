package com.example.recycleview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.DataViewHolder> {
    Context ctx;
    String[] names;
    String[] addreses;
    int []images;
    public MyAdapter(Context ctx,String[] name ,String [] address,int []img)
    {
        this.ctx=ctx;
        names=name;
        addreses=address;
        images=img;
    }
    @NonNull
    @Override
    public MyAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DataViewHolder(LayoutInflater.from(ctx).inflate(R.layout.rowdesign, parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.DataViewHolder holder, int position) {
        holder.img.setImageResource(images[position]);
        holder.name.setText(names[position]);
        holder.address.setText(addreses[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name,address;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.iv);
            name=itemView.findViewById(R.id.titel_name);
            address=itemView.findViewById(R.id.subtitle_address);

        }
    }
}
