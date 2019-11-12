package com.example.appbaby.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.appbaby.AlphabetEng;
import com.example.appbaby.R;
import com.example.appbaby.model.app;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private List<app> mAppList;

    public RecyclerViewAdapter(Context mContext, int mResource, List<app> mAppList) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mAppList = mAppList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        app app = mAppList.get(position);

        holder.app = app;
        holder.nameTextView.setText(app.category);
        holder.descriptionTextView.setText(app.district);
        holder.categoryImageView.setImageResource(app.imageRes);
    }

    @Override
    public int getItemCount() {
        return mAppList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView categoryImageView;
        private TextView nameTextView;
        private TextView descriptionTextView;

        private app app;

        private MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.categoryImageView = itemView.findViewById(R.id.logo_image_view);
            this.nameTextView = itemView.findViewById(R.id.category_name_text_view);
            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, AlphabetEng.class);
                    intent.putExtra("name", app.category);
                    intent.putExtra("image", app.imageRes);
                    mContext.startActivity(intent);
                }
            });
        }
    }

}
