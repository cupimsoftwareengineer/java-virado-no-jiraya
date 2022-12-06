package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1997, Month.JUNE, 24, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Days: " + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Years: "+ ChronoUnit.YEARS.between(aniversario, now));

    }
}
