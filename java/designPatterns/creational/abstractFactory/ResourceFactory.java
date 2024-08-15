package designPatterns.creational.abstractFactory;

/**
 * ResourceFactory
 */
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
