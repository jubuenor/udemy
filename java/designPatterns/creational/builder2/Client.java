package designPatterns.creational.builder2;

import java.time.LocalDate;

import designPatterns.creational.builder.Adress;
import designPatterns.creational.builder.User;
import designPatterns.creational.builder2.UserDTO.UserDTOBuilder;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .build();
    }

    public static User createUser() {
        User user = new User();

        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1980, 1, 1));
        Adress adress = new Adress();
        adress.setCity("New York");
        adress.setStreet("5th Avenue");
        adress.setZipCode("10001");
        user.setAdress(adress);
        user.setAdress(adress);
        return user;
    }
}
