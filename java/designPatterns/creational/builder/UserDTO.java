package designPatterns.creational.builder;

/**
 * UserDTO
 */
public interface UserDTO {

    String getName();

    String getAddress();

    String getAge();

    void setName(String name);

    void setAddress(String address);

    void setAge(String age);

    @Override
    String toString();
}
