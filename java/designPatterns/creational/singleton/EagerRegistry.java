package designPatterns.creational.singleton;

/**
 * EagerRegistry
 */
public class EagerRegistry {

    private EagerRegistry() {
        System.out.println("EagerRegistry is initializing");
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }

}
