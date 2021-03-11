package com.Application;

import java.util.Scanner;

public class MovieTickets extends Movies implements IMovieTickets{

    MovieTickets()
    {
        IApplication applicationLogin=new ApplicationLogin();
        System.out.println("Welcome to Movie tickets Application "+applicationLogin.getUserName());
    }
    Scanner scanner=new Scanner(System.in);
    private String seatNumber="A2";
    @Override
    public void bookTickets() {
        System.out.println("Type the movie name ");
        String movieName=scanner.next();
        System.out.println("Your tickets are booked for "+movieName);
    }

    @Override
    public void getSeatNumber() {
        System.out.println("The allocated seat number is "+seatNumber);
    }

    @Override
    public void setSeatNumber(String seatNumber) {
        this.seatNumber=seatNumber;
    }

    @Override
    public void getMovieNames() {
        System.out.println("The Showing movies are :");
        for (int movie=0;movie<movieNames.size();movie++)
        {
            System.out.println(movieNames.get(movie));
        }
    }
}
