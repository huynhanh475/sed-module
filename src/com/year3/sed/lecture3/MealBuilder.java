package com.year3.sed.lecture3;

public interface MealBuilder {

    public Meal getMeal();

    public void reset();

    public void mainCourse (Item item);

    public void beverage (Item item);
}