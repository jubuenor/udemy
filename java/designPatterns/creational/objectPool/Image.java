package designPatterns.creational.objectPool;

import javafx.geometry.Point2D;

import designPatterns.creational.objectPool.Poolable;

/**
 * Image
 */
public interface Image extends Poolable {

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
