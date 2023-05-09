package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mAdapter extends RecyclerView.Adapter<mAdapter.MyViewHolder> {

    private List<Mountain> mountains;
    private Context context;

    public mAdapter(Context context, List<Mountain> mountains) {
        this.context = context;
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public mAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mountain_item, parent, false);
        return new mAdapter.MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull mAdapter.MyViewHolder holder, int position) {
        holder.mountainName.setText(mountains.get(position).getName());
        holder.mountainHeight.setText(mountains.get(position).getSize() + "m");
        Glide.with(context).load(mountains.get(position).getImage()).into(holder.mountainImage);
        System.out.println(mountains.get(position).toString());
        holder.mountainDescription.setText(mountains.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mountainName;
        TextView mountainHeight;
        TextView mountainDescription;

        ImageView mountainImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mountainName = itemView.findViewById(R.id.textViewName);
            mountainHeight = itemView.findViewById(R.id.textViewHeight);
            mountainImage = itemView.findViewById(R.id.imageViewMountain);

            mountainDescription = itemView.findViewById(R.id.textViewDesc);
        }
    }
}