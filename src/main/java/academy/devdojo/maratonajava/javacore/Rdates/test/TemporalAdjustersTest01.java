package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        now = now.with(ChronoField.DAY_OF_MONTH, 20); // Muda o dia do mês para 20
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)); // Próxima segunda
        // now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // Última segunda
        // now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
