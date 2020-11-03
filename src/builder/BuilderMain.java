package builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderMain {
    public static void main(String[] args) {
//        PersonLong personLong = new PersonLong(
//                25L,
//                "Yossi",
//                "Sha'ashua",
//                59,
//                new Address("Yeruham", "Herzel", 45),
//                "FootBall",
//                LocalDate.now().minusYears(59),
//                "shusha"
//        );

        Person p1 = new Person.Builder()
                .id(2)
                .firstName("Danny")
                .lastName("Phimma")
                .hobby("Swimming")
                .petName("Oscar")
                .build();

        Person p2 = new Person.Builder()
                .id(1)
                .firstName("Yoss")
                .lastName("Gross")
                .hobby("Swimming")
                .build();

//        System.out.println(p1);


       List<Person> friends = new ArrayList<>();
        friends.add(p1);
        friends.add(p2);

        System.out.println(friends);




    }
}

