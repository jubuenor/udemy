package designPatterns.creational.objectPool;

import javafx.geometry.Point2D;

/**
 * Bitmap
 */
public class Bitmap implements Image {

    private Point2D location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing bitmap " + name + " @ " + location);
    }

    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset");
    }

}
