package designPatterns.creational.abstractFactory.aws;

import designPatterns.creational.abstractFactory.ResourceFactory;
import designPatterns.creational.abstractFactory.Storage;
import designPatterns.creational.abstractFactory.Instance;

/**
 * AwsResourceFactory
 */
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }

}
