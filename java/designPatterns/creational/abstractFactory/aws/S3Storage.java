package designPatterns.creational.abstractFactory.aws;

import designPatterns.creational.abstractFactory.Storage;

/**
 * S3Storage
 */
public class S3Storage implements Storage {

    public S3Storage(int capacity) {
        System.out.println("Created S3 storage with capacity " + capacity);
    }

    public String getId() {
        return "S3";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
