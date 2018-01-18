package com.example.paco.lon2;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class weakAndStrongFragment extends Fragment {

    public List<Champion> championsWeak;
    public List<Champion> championsStrong;
    RecyclerView containerChampsWeak;
    RecyclerView containerChampsStrong;
    Toolbar title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weak_and_strong, container, false);

        /*title = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(title);
        //title.setSubtitle("Hola");*/


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),4);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(getContext(),4);

        containerChampsWeak = (RecyclerView) view.findViewById(R.id.containerChampsWeak);
        containerChampsWeak.setLayoutManager(gridLayoutManager);
        ChampionAdapter adapterWeak = new ChampionAdapter(championsWeak, getContext());
        containerChampsWeak.setAdapter(adapterWeak);


        containerChampsStrong = (RecyclerView) view.findViewById(R.id.containerChampsStrong);
        containerChampsStrong.setLayoutManager(gridLayoutManager1);
        ChampionAdapter adapterStrong = new ChampionAdapter(championsStrong, getContext());
        containerChampsStrong.setAdapter(adapterStrong);

        // Inflate the layout for this fragment
        return view;
    }
}