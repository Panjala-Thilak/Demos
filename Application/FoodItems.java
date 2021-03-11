package com.Application;

public class FoodItems extends ApplicationLogin implements IFoodItems{

    FoodItems()
    {
        System.out.println("Welcome to Food Ordering Application " +getUserName());
    }
    @Override
    public void buyFruits(String fruit) {
        System.out.println("you ordered for "+fruit+"...It will be delivered soon");
    }

    @Override
    public void buyMilk(int liters) {
        System.out.println("You brought "+liters+" liters of milk");
    }

    @Override
    public void buyMilk(double liters) {
        System.out.println("You brought "+liters+" liters of milk");
    }
}
