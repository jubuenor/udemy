package designPatterns.creational.factoryMethod.message;

/**
 * Message
 */
public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        // Adds some default headers
    }

    public void encrypt() {
        // Some code to encrypt the content
    }

}
