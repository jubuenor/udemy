package designPatterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * UserWebDTOBuilder
 */
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String adress;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Adress adress) {
        this.adress = adress.getHouseNumber() + ", " + adress.getStreet() + "\n" + adress.getCity() + "\n"
                + adress.getState() + " - " + adress.getZipCode();
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, adress, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }

}
