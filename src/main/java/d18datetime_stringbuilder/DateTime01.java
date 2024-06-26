package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //ornek 1: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.

        Scanner input = new Scanner(System.in);
        System.out.println("dogum tarihinizi gun ay yil seklinde giriniz");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());

    }
}
