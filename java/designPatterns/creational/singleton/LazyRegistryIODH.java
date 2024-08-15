package designPatterns.creational.singleton;

/**
 * LazyRegistryIODH
 */

public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("LazyRegistryIODH initialized");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

    public void getConfiguration() {
        System.out.println("LazyRegistryIODH initialized");
    }

}
