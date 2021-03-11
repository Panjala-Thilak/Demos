package com.designpriciples;
//All OOPS Concepts
import java.util.Scanner;

class MovieTickets
{
    private Movies movies;
    MovieTickets()
    {
        movies=new Movies();
        movies.setMovieNames("The showing movies are :\n1.Sri Manjunatha\n2.Bhookailas\n3.Damarukam\n");
    }
    public String getMovieNames()
    {
        return movies.getMovieNames();
    }
    private String seatNumber="A23";
    void bookTickets(String movieName)
    {
        System.out.println("Your Tickets are Booked for "+movieName);
    }
    void getseatNumber()
    {
        System.out.println("seat Number :"+seatNumber);
    }
    void setseatNumber(String seatNumber)
    {
        this.seatNumber=seatNumber;
    }
}
class Movies
{
    private String movieNames;

    public void setMovieNames(String movieNames) {
        this.movieNames=movieNames;
    }
    public String getMovieNames() {
        return this.movieNames;
    }
}
interface Fruits
{
    void buyFruits(String fruitName);
}
interface Temples
{
    void showTemples();
}
class ShivaApplication extends MovieTickets implements Fruits,Temples
{
    @Override
    public void buyFruits(String fruitName) {
        System.out.println("You have ordered for "+fruitName +" fruits.. It will be delivered shortly.");
    }

    @Override
    public void showTemples() {
        System.out.println("The Temples near you are\n1.The Ramalingeshwara Temple-Kukatpally\n2.The Rajarajeshwara Temple-Kphb");
    }
}

class Customer {
    public static void main(String[] args) {
        ShivaApplication application=new ShivaApplication();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Choose Your Option 1.Watch a Movie 2.Buy Fruits 3.Temples");
            int option=scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(application.getMovieNames());
                    String movieName = scanner.next();
                    application.bookTickets(movieName);
                    application.getseatNumber();
                    break;
                case 2:
                    System.out.println("Enter the fruit to be ordered");
                    String fruitName = scanner.next();
                    application.buyFruits(fruitName);
                    break;
                case 3:
                    application.showTemples();
            }
            System.out.println("Enter 'y' to continue with process");
        }while("y".equals(scanner.next()));
    }
}

