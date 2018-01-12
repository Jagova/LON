package com.example.paco.lon2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;


import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class CounterPickFragment extends Fragment {

    public List<Champion> champions;
    public RecyclerView containerChamps;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_counterpick, container, false);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),4);


        containerChamps = (RecyclerView) view.findViewById(R.id.containerChamps);
        containerChamps.setLayoutManager(gridLayoutManager);





        ChampionAdapter adapter = new ChampionAdapter(champions, getContext());

        containerChamps.setAdapter(adapter);



       // System.out.println("Se hizo el adapter");

        return view;
    }
}