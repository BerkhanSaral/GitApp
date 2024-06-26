package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.//

        //Example 8: If the date you have received from the user is in the past, give the message "You have entered an invalid date".
        //If the date you have received from the user is in the future, say "You can enter the time".

        Scanner input = new Scanner(System.in);

        LocalDate givenDate = null;

        while (true) {
            System.out.println("lutfen yili giriniz");
            int year = input.nextInt();
            System.out.println("lutfen ayi giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("ay 1 ile 12 arasinda olamlidir tekrar deneyin");
                continue;
            }
            System.out.println("lutfen gunu giriniz");
            int day = input.nextInt();

            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            if (day < 1 || day > daysInMonth) {
                System.out.println("girilen ay icin gecersiz gun tekrar deneyin");
                continue;
            }
            givenDate = LocalDate.of(year, month, day);
            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println("gecersiz gecmis bir tarih girdiniz");
            }else {
                System.out.println("zamani girebilriniz");
                break;
            }
        }
    }
}
