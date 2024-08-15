package designPatterns.creational.singleton;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry == registry2);

        LazyRegistryWithDCL lazyRegistry = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazyRegistry == lazyRegistry2);

        LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();
        System.out.println(lazyRegistryIODH == lazyRegistryIODH2);

    }
}
