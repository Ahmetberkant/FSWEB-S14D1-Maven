package com.workintech.cylinder;

import java.util.Locale;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public String getVolumeString() {
        return String.format(Locale.GERMAN, "%.2f", getVolume());
    }

    public String getAreaString() {
        return String.format(Locale.GERMAN, "%.2f", getArea());
    }
}
