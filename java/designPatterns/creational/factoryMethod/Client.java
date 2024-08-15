package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.message.Message;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.createMessage();
        System.out.println(message.getContent());
    }
}
