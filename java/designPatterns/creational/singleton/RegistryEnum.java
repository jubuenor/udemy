package designPatterns.creational.singleton;

/**
 * RegistryEnum
 */
public enum RegistryEnum {

    INSTANCE;

    public void getConfiguration() {
        System.out.println("RegistryEnum initialized");
    }

}
