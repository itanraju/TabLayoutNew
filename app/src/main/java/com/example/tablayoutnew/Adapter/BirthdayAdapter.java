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

import java.util.List;

public class BirthdayAdapter extends RecyclerView.Adapter<BirthdayAdapter.ViewHolder> {

    Context context;
    List<Theme> themeList;

    public BirthdayAdapter(Context context, List<Theme> themeList) {
        this.context = context;
        this.themeList = themeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(com.example.tablayoutnew.R.layout.birthday_layout,null,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).load(themeList.get(position).getTheme_thumbnail()).into(holder.birthday);

    }

    @Override
    public int getItemCount() {
        return themeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView birthday;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            birthday=itemView.findViewById(com.example.tablayoutnew.R.id.birthday);

        }
    }
}
