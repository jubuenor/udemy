package designPatterns.creational.singleton;

/**
 * LazyRegistryWithDCL
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {
        System.out.println("LazyRegistryWithDCL initialized");
    }

    private static volatile LazyRegistryWithDCL INSTANCE; // volatile is used to prevent reordering of code by JVM.
                                                          // Forces value to be read from memory, not from cache.

    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) { // double check locking
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }

}
