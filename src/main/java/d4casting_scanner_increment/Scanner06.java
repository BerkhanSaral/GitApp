package d4casting_scanner_increment;

import java.util.Locale;
import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        /*Ornek 6: Yeni Satir Karakteri ('\n') Hatasi: Ardışık olarak birden fazla Scanner objesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Yasinizi giriniz ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Adinizi yaziniz ");
        String name = input.nextLine();

                //Aciklama: Bu kodda, nextInt() çağrısından sonra nextLine() hemen çağrılır.
        // Ancak, kullanıcının yaşını girdikten sonra Enter tuşuna basmasıyla oluşan
        // yeni satır karakteri (\n) girdi akışında kalır. nextInt() yalnızca sayısal değeri okur
        // ve yeni satır karakterini okumaz(akista kalir). Bu yüzden, program nextLine()’a ulaştığında,
        // hâlâ okunmamış bir yeni satır karakteri bulur ve bunu boş bir satır olarak yorumlar,
        // böylece kullanıcıdan adını almak için beklemeksizin hemen ilerler.
    }
}
