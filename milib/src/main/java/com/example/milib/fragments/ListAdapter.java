package com.example.milib.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.milib.R;

import java.util.ArrayList;

/**
 * Created by bm on 28/11/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MiViewHolder> {

    public ArrayList<String> nom;


    public ListAdapter(ArrayList<String> nom){
        this.nom=nom;
    }


    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell_layout, null);
        MiViewHolder viewHolder = new MiViewHolder(view);
        return viewHolder;

        //return null;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
        /*if(position==0){
            holder.nombre.setText("Yony");
        }
        else if(position==1){
            holder.nombre.setText("Javi");
        }*/

        holder.nombre.setText(nom.get(position));

    }

    @Override
    public int getItemCount() {
        return nom.size();
    }

    class MiViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;

        public MiViewHolder(View view) {
            super(view);
            nombre = (TextView) view.findViewById(R.id.nombre);

        }


    }
}
