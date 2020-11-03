package builder;

import java.time.LocalDate;

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private String hobby;
    private LocalDate birthDate;
    private String petName;


    public static class Builder {

        private Long id;
        private String firstName;
        private String lastName;
        private int age;
        private Address address;
        private String hobby;
        private LocalDate birthDate;
        private String petName;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.firstName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Builder hobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder petName(String petName) {
            this.petName = petName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.hobby = builder.hobby;
        this.birthDate = builder.birthDate;
        this.petName = builder.petName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", hobby='" + hobby + '\'' +
                ", birthDate=" + birthDate +
                ", petName='" + petName + '\'' +
                '}';
    }
}






