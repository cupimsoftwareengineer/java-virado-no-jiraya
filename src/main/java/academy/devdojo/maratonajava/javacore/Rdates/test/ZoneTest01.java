package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        //  System.out.println(ZoneId.systemDefault());

        ZoneId spZone = ZoneId.of("America/Sao_Paulo");
        System.out.println(spZone);

        System.out.println("-----------------");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println("-----------------");

        ZonedDateTime zonedDateTime = now.atZone(spZone);
        System.out.println(zonedDateTime);

        System.out.println("-----------------");

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        System.out.println("-----------------");

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(spZone);
        System.out.println(zonedDateTime2);

        System.out.println("-----------------");

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        System.out.println("-----------------");

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        System.out.println("-----------------");

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}
