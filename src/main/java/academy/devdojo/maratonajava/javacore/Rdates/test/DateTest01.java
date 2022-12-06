package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1670331353415L); // long 10000 / janeiro 1970
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
