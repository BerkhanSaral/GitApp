package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.Period;

public class DateTime02 {
    public static void main(String[] args) {
        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates.

        //Java'da Period sınıfı, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        LocalDate date1 = LocalDate.of(2024, 5, 28);
        LocalDate date2 = LocalDate.of(2022, 12, 24);

        Period difference = Period.between(date2, date1);
        System.out.println(difference);    //P1Y5M4D, P: Period, 1Y: 1 Yil, 5M: 5 Ay, 4D: 4 Gun

        System.out.println(date1 + " ve " + date2 + " arasindaki fark : ");

        int yearDifference = difference.getYears();
        System.out.println("Year : "+yearDifference);

        int monthDifference = difference.getMonths();
        System.out.println("Month : "+monthDifference);

        int dayDifference = difference.getDays();
        System.out.println("Day : "+dayDifference);


        //ODEV: Duration Class nedir?

    }
}
