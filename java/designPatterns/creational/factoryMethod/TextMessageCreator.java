package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.message.Message;
import designPatterns.creational.factoryMethod.message.TextMessage;

/**
 * TextMessageCreator
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }

}
