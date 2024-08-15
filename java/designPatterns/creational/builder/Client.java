package designPatterns.creational.builder;

import java.time.LocalDate;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withBirthday(user.getBirthday()).withAddress(user.getAdress()).build(); // method chaining

    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1980, 1, 1));
        Adress adress = new Adress();
        adress.setHouseNumber("123");
        adress.setStreet("Main Street");
        adress.setCity("New York");
        adress.setState("NY");
        adress.setZipCode("10010");
        user.setAdress(adress);
        return user;
    }
}
