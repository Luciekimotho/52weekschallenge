package com.luciekimotho.a52weekschallenge.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class WeekAdapter extends RecyclerView.Adapter<WeekAdapter.WeekViewHolder> {


    @NonNull
    @Override
    public WeekViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WeekViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class WeekViewHolder extends RecyclerView.ViewHolder{

    public WeekViewHolder(View itemView) {
        super(itemView);
    }
}
}
