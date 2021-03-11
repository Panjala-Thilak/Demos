//Factory Method Design Pattern.
//subclasses decide which classes to instantiate
package designpatterns.factorymethod;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

abstract class Fuel{
    protected double rate;
    abstract void getRate();

    public void calculateBill(double liters){
        System.out.println(liters*rate);
    }
}

class Petrol extends Fuel
{
    @Override
    void getRate() {
        rate=95.5;
    }
}

class Disel extends Fuel
{
    @Override
    void getRate() {
        rate = 90;
    }
}

class GetFuelFactory
{
    public Fuel getFuel(String fuelType)
    {
        if(fuelType==null)
            return null;
        if (fuelType.equalsIgnoreCase("petrol"))
        {
            return new Petrol();
        }
        else if(fuelType.equalsIgnoreCase("disel"))
        {
            return new Disel();
        }

        return null;
    }
}
public class BillGeneration {
    public static void main(String[] args) {
        GetFuelFactory fuelFactory=new GetFuelFactory();
        System.out.println("Enter the fuel Type:");
        Scanner scanner=new Scanner(System.in);
        String fuelType=scanner.next();
        Fuel fuel=fuelFactory.getFuel(fuelType);
        System.out.println("Enter the number of liters :");
        double liters=scanner.nextDouble();
        System.out.println("The Bill for the "+fuelType+" of "+liters+ " liters is:");
        fuel.getRate();
        fuel.calculateBill(liters);

    }

}
