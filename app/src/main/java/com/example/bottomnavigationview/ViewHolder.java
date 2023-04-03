package com.example.bottomnavigationview;

import static android.media.CamcorderProfile.get;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    Button btn_2;

    public ViewHolder(Context context, @NonNull View itemView) {
        super(itemView);

        textView=itemView.findViewById(R.id.textView);
        btn_2=itemView.findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strText= textView.getText().toString();
                Intent intent = new Intent(view.getContext(), MainActivity3.class);
                intent.putExtra("strText", strText);
                view.getContext().startActivity(intent);


                }



            });
        }
    }

