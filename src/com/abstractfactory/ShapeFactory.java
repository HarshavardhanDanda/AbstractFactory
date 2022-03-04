package com.abstractfactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    public color getColor(String color){
    return null;
    }

    @Override
    shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("square")) {
            return new square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new rectangle();
        } else if (shape.equalsIgnoreCase("circle")) {
            return new circle();
        }
        return null;
    }
    }

