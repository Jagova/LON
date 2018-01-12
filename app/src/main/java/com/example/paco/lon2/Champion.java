package com.example.paco.lon2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paco on 09/01/2018.
 */

public class Champion {

    public String img;
    public String name;
    public int id;
    public List<Integer> weakVs;
    public List<Integer> strongVs;
    public double winRatePrc;

    public Champion(){
        weakVs = new ArrayList<Integer>();
        strongVs = new ArrayList<Integer>();
    }
}
