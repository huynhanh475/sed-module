package com.year3.sed.lecture5.shape_factory;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.displayShape();
    }
}
