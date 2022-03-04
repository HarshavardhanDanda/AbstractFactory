package com.abstractfactory;

public abstract class AbstractFactory {
    abstract color getColor(String color);
    abstract shape getShape(String shape);
}
