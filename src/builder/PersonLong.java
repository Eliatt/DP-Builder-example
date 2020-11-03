package builder;

import java.time.LocalDate;

public class PersonLong {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private String hobby;
    private LocalDate birthDate;
    private String petName;

    public PersonLong(Long id, String firstName, String lastName, int age, Address address, String hobby, LocalDate birthDate, String petName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.hobby = hobby;
        this.birthDate = birthDate;
        this.petName = petName;
    }
}
