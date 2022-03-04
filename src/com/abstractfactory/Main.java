package com.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory= FactoryProducer.getFactory("shape");
        shape shape1= shapeFactory.getShape("circle");
        shape1.draw();

        AbstractFactory colorFactory= FactoryProducer.getFactory("Color");
        color color1= colorFactory.getColor("red");
        color1.fill();
    }
}
