package com.atkandroid.atk_wallpaper.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.atkandroid.atk_wallpaper.R;
import com.atkandroid.atk_wallpaper.ViewActivity;
import com.atkandroid.atk_wallpaper.model.CustomItems;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder> {

    List<CustomItems> itemsList;
    Context context;

    public RecyclerViewAdapter(List<CustomItems> itemsList, Context context) {
        this.itemsList = itemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_layout,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        Picasso.get().load(itemsList.get(position).getUrl()).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imgView;

        public ImageViewHolder(@NonNull View view) {
            super(view);
            imgView = view.findViewById(R.id.imgView);
            imgView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, ViewActivity.class);
            intent.putExtra("images",itemsList.get(getAdapterPosition()).getUrl());
            context.startActivity(intent);
        }
    }


}
