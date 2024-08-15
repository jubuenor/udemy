package designPatterns.creational.abstractFactory.gcp;

import designPatterns.creational.abstractFactory.Instance;
import designPatterns.creational.abstractFactory.Storage;

/**
 * GoogleComputeEngineInstance
 */
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute Engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine instance stopped");
    }

}
