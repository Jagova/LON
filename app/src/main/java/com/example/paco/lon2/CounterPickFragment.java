package com.example.paco.lon2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;


import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class CounterPickFragment extends Fragment {

    public List<Champion> champions;
    private RecyclerView containerChamps;

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


        final GestureDetector mGestureDetector = new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() {
            @Override public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });

        containerChamps.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                try {
                    View child = containerChamps.findChildViewUnder(e.getX(), e.getY());

                    if (child != null && mGestureDetector.onTouchEvent(e)) {

                        int position = rv.getChildAdapterPosition(child);

                        Toast.makeText(getContext(),"The Item Clicked is: "+ position ,Toast.LENGTH_SHORT).show();



                        Log.i("error","Antes de pasar la lista");

                        weakAndStrongFragment fragment = new weakAndStrongFragment();

                        List<Champion> weak = new ArrayList<Champion>();
                        List<Champion> strong = new ArrayList<Champion>();

                        for (int i:champions.get(position).weakVs) {
                            weak.add(champions.get(i));
                        }
                        fragment.championsWeak = weak;
                        for(int j:champions.get(position).strongVs){
                            strong.add(champions.get(j));
                        }
                        fragment.championsStrong = strong;

                        Log.i("error","Antes de hacer la traslacion");

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.container, fragment, fragment.getTag()).commit();

                        Log.i("error","Fin");
                        return true;
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

       // System.out.println("Se hizo el adapter");

        return view;
    }

    public void OnClick(View V){
        Log.d("Click", "OnClick: " + V.getId());
    }

}