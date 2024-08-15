package designPatterns.creational.factoryMethod.message;

/**
 * JSONMessage
 */
public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }

}
