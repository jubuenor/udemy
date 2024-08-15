package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.message.Message;

/**
 * MessageCreator
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    // Factory method
    public abstract Message createMessage();

}
