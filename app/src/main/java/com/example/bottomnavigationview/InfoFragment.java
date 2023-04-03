package com.example.bottomnavigationview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class InfoFragment extends Fragment {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        recyclerView=root.findViewById(R.id.recyceler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter =new Adapter();
        for(int i=0; i<100; i++)
        {
            String str = (i+1)+"번째 아이템";
            adapter.setArrayList(str);
        }

        recyclerView.setAdapter(adapter);
        return root;
    }
}