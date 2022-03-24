package com.year3.sed.lecture3;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private Item mainCourse;
    private Item beverage;

    public Item getBeverage() {
        return beverage;
    }

    public Item getMainCourse() {
        return mainCourse;
    }

    public void setBeverage(Item beverage) {
        this.beverage = beverage;
    }

    public void setMainCourse(Item mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void showPrice(){
        double cost = mainCourse.price() + beverage.price();
        System.out.println("Price: " + cost);
    }

    public void showItems(){
        System.out.println("Main course : " + mainCourse.name());
        System.out.println("Beverage : " + beverage.name());

    }
}
