package d17constructors_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {
        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.//

        //Example 8: If the date you have received from the user is in the past, give the message "You have entered an invalid date".
        //If the date you have received from the user is in the future, say "You can enter the time".

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen verilen sirada sirada tarihi giriniz yil-ay-gun");

        System.out.println("lutfen yili giriniz");
        int year = input.nextInt();
        System.out.println("lutfen ayi giriniz");
        int month = input.nextInt();
        System.out.println("lutfen gunu giriniz");
        int day = input.nextInt();

       /* if(year< LocalDate.now().getYear()){
            System.out.println("gecersiz tarih girisi");
        }*/
        LocalDate givenDate = LocalDate.of(year, month, day);
        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("gecersiz tarih girdiniz");
        }else {
            System.out.println("zamani girebilirisiniz");
        }

    }
}
