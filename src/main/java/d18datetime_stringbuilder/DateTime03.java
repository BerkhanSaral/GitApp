package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August  */

        //Anlik zamani nasil aliriz?

        //LocalTime kullanacagiz.
        //LocalTime, Java'nın java.time paketinde bulunan bir Class'tir ve sadece saat bilgisini
        //(saat, dakika, saniye ve milisaniye) temsil etmek için kullanılır.
        //Bu sınıf, tarih bilgisini içermez ve yalnızca saatle ilgilidir.

        //Ornek 1: now(): Gecerli saat bilgisini alir.


        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        //ornek 2:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.
        //DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve metni tarih ve saat nesnelerine çözmenize olanak tanır.
        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini biçimlendirmek için kullanılır.
        //format() method’u LocalTime’i String’e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);

        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate);

        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam’da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);

        //--------------
        /*Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        //Tum zaman dilimleyini listeleyelim
        for (String w : zoneIds) {
            System.out.println(w);
        }

        //Zaman dilimlerini sayisini yazdiralim
        System.out.println("Toplam zaman dilimlerini sayisi : " + zoneIds.size());*/

        //---------------
        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MMM-dd \nhh-mm a");
        String formattedLdt = dtf3.format(ldt);
        System.out.println(formattedLdt);


    }
}
