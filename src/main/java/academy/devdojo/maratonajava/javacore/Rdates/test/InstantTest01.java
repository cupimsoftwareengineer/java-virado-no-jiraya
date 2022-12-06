package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); // horário neutro Zulu Time
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}
