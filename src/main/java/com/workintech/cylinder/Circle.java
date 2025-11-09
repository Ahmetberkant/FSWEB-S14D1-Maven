package com.workintech.cylinder;

import java.util.Locale;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getAreaString() {
        return String.format(Locale.GERMAN, "%.2f", getArea());
    }
}
