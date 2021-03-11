package com.Application;

import java.util.ArrayList;
import java.util.List;

public abstract class Movies implements IMovies {
     static List movieNames=new ArrayList<>();
     Movies()
     {
         movieNames.add("Damarukam");
         movieNames.add("Sri Manjunatham");
     }
    public void setMovieNames(String movieName)
    {
        movieNames.add(movieName);
    }
}
