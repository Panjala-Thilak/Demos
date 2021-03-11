package com.Application;

import java.util.ArrayList;
import java.util.List;

public class Meditation extends ApplicationLogin implements IMeditation{
    List<String> temples=new ArrayList<>();
    List<String> places=new ArrayList<>();
    Meditation()
    {
        System.out.println("Welcome to Movie tickets Application " +getUserName());
        temples.add("RamaLingeshwaraTemple--Kphb");
        temples.add("RajaRajeshwaraTemple--Kukatpally");

        places.add("Sadhguru Meditations");
        places.add("Om Shanti Trust");
    }
    public void setTemples(String name) {
        temples.add(name);
    }

    @Override
    public void getTemples() {
        for (int temple=0;temple< temples.size();temple++) {
            System.out.println(temples.get(temple));
        }
    }

    @Override
    public void setPeacefulPlaces(String place) {
        places.add(place);
    }


    @Override
    public void getPeacefulPlaces() {
        for(int place=0;place<places.size();place++) {
            System.out.println(places.get(place));
        }
    }
}
