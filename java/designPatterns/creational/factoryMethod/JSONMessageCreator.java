package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.message.JSONMessage;
import designPatterns.creational.factoryMethod.message.Message;

/**
 * JSONMessageCreator
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }

}
