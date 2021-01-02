package com.example.tablayoutnew.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tablayoutnew.Model.Theme;
import com.example.tablayoutnew.R;

import java.util.List;

public class LoveAdapter extends RecyclerView.Adapter<LoveAdapter.ViewHolder> {

    Context context;
    List<Theme> themeList;

    public LoveAdapter(Context context, List<Theme> themeList) {
        this.context = context;
        this.themeList = themeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(com.example.tablayoutnew.R.layout.birthday_layout,null,false);
        return new LoveAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).load(themeList.get(position).getTheme_thumbnail()).into(holder.love);

    }

    @Override
    public int getItemCount() {
        return themeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView love;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            love=itemView.findViewById(R.id.birthday);
        }
    }
}
