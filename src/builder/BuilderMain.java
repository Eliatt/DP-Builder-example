package builder;

import java.time.LocalDate;

public class BuilderMain {
    public static void main(String[] args) {
        PersonLong personLong = new PersonLong(
                25L,
                "Yossi",
                "Sha'ashua",
                59,
                new Address("Yeruham", "Herzel", 45),
                "FootBall",
                LocalDate.now().minusYears(59),
                "shusha"
        );
    }
}
