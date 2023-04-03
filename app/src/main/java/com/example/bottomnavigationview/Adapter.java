package com.example.bottomnavigationview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {


    ArrayList<String> arrayList;
    private android.view.LayoutInflater LayoutInflater;

    public Adapter(){
        arrayList=new ArrayList<>();
    }
    Context context = null;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(context, view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String text = arrayList.get(position);
        holder.textView.setText(text);




    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void setArrayList(String strData){
        arrayList.add(strData);
    }
}
