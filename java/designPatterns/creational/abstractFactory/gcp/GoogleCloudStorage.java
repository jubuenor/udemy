package designPatterns.creational.abstractFactory.gcp;

import designPatterns.creational.abstractFactory.Storage;

/**
 * GoogleCloudstorage
 */
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");

    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }

}
