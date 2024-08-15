package designPatterns.creational.builder;

import java.time.LocalDate;

/**
 * UserDTOBuilder
 */
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Adress adress);

    UserDTO build();

    UserDTO getUserDTO();
}
