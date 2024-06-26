package d5increment_decrement_if;

import java.util.Locale;
import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
                /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
          1==> Pazar, 2 ==> Pazartesi …*
        
        //*Example 1: When you receive the number of days from the user, write the code that writes the day name
          1==> Sunday, 2 ==> Monday …*/

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("lutfen kacinci gun oldugunu giriniz");
        int day = input.nextInt();

        if (day <= 0) {
            System.out.println("Gun sayisi 1`den kucuk olamaz");
        } else if (day == 1) {
            System.out.println("Pazar");
        } else if (day == 2) {
            System.out.println("Pazartesi");
        } else if (day == 3) {
            System.out.println("Sali");
        } else if (day == 4) {
            System.out.println("Carsamba");
        } else if (day == 5) {
            System.out.println("Persembe");
        } else if (day == 6) {
            System.out.println("Cuma");
        } else if (day == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Gun sayisi 7`den buyuk olamaz");
        }

    }
}
    
