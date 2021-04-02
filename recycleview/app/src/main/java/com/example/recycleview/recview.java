package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recview extends RecyclerView.Adapter<recview.MyHost> {
    MainActivity obj=new MainActivity();

    @NonNull
    @Override
    public MyHost onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHost(LayoutInflater.from(obj.ctx).inflate(R.layout.adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHost holder, int position) {
        holder.name.setText(obj.name[position]);
        holder.rollnum.setText(obj.rollnum[position]);
        holder.img.setImageResource(obj.images[position]);

    }

    @Override
    public int getItemCount() {
        return obj.name.length;
    }

    public class MyHost extends RecyclerView.ViewHolder {
        TextView name,rollnum;
        ImageView img;
        public MyHost(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            rollnum=itemView.findViewById(R.id.rollnumber);
            img=itemView.findViewById(R.id.imge);

        }
    }
}
