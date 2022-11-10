package com.codegym;

public class Circle {
    private static double radius = 1.0;
    private static final String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getArea() {
        return Math.pow(getRadius(),2) * Math.PI;
    }
}
