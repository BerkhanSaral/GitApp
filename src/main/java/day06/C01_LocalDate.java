package day06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate ali = LocalDate.of(19231, 10, 29)
                .plusYears(45)
                .plusMonths(8)
                .plusDays(5);
        System.out.println(ali);

        LocalDate veli = LocalDate.of(1993, 9, 15)
                .minusYears(24)
                .minusMonths(2)
                .minusDays(11);
        System.out.println(veli);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM-yyyy");
        System.out.println(formatter.format(ali));
        System.out.println(ali.format(formatter));

        if (ali.equals(veli)) {
            System.out.println("ayni tarih");
        } else if (ali.isBefore(veli)) {
            System.out.println("ali buyuk");
        } else if (veli.isBefore(ali)) {
            System.out.println("veli daha buyuk");
        }

    }
}
