package com.Application;

import java.util.Scanner;

public class Customer extends ApplicationLogin {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=scanner.next();
        System.out.println("Enter Password");
        String password=scanner.next();
        ApplicationLogin applicant=new ApplicationLogin();
        applicant.login(username,password);

        IFoodItems faster=new FoodItems();
        faster.buyMilk(2);
        faster.buyFruits("Sapota");
        faster.buyMilk(3.2);

        IMovieTickets moviesFan=new MovieTickets();
        moviesFan.getMovieNames();
        moviesFan.bookTickets();
        moviesFan.getSeatNumber();

        IMeditation peacefulPerson=new Meditation();
        peacefulPerson.getPeacefulPlaces();
        peacefulPerson.getTemples();
    }

}
