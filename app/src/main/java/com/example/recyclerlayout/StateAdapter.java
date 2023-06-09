package com.example.recyclerlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends {
    private final LayoutInflater inflater;
    private final List<State> states;
    StateAdapter(Context context, List<State> states){
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public StateAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType)
    {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position){
        State state = states.get(position);
        holder.flagView.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getCapital());
    }

    @Override
    public int getItemCount(){
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = (ImageView) view.findViewById(R.id.flag);
            nameView = (TextView) view.findViewById(R.id.name);
            capitalView = (TextView) view.findViewById(R.id.capital);
        }
    }
}
