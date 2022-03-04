package com.abstractfactory;

public class ColorFactory extends AbstractFactory{
    @Override
    color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("blue")) {
            return new blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new green();
        } else if (color.equalsIgnoreCase("red")) {
            return new red();
        }
    return null;
    }
    @Override
    shape getShape(String shape) {
        return null;
    }}
