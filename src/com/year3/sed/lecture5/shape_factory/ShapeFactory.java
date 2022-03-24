package com.year3.sed.lecture5.shape_factory;

import java.util.HashMap;

public class ShapeFactory {
    static HashMap<String, Shape> shapeTypes = new HashMap<String, Shape>();

    static  {
        shapeTypes.put("circle", new Circle());
        shapeTypes.put("square", new Square());
        shapeTypes.put("rectangle", new Rectangle());
    }

    public static Shape getShape(String shapeType) {
        return shapeTypes.get(shapeType);
    }

//    public static Shape getShape(String type) {
//        switch (type) {
//            case "circle":
//                return new Circle();
//            case "square":
//                return new Square();
//            case "rectangle":
//                return new Rectangle();
//            default:
//                System.out.println("Unknown shape. Return null.");
//                return null;
//        }
//    }
}
