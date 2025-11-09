package com.workintech.pool;

import java.util.Locale;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
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

    @Override
    public String getAreaString() {
        return super.getAreaString();
    }
}
