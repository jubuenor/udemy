package designPatterns.creational.factoryMethod.message;

/**
 * TextMessage
 */
public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }

}
