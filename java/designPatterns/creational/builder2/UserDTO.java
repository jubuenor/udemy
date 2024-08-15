package designPatterns.creational.builder2;

/**
 * UserDTO
 */
public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", address='" + getAddress() + "'" +
                ", age='" + getAge() + "'" +
                "}";
    }

    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public UserDTOBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAge(age);
            userDTO.setAddress(address);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }

    }
}
