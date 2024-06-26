package ssg_stringmanipulations;

public class stringManipulations01 {
    public static void main(String[] args) {
                /*
            toLowerCase : harfleri kucultmeyi saglar.
            toUpperCase : harfleri buyultmeyi saglar.
            length : karakter sayisini yani uzunlugunu verir.
            equals : esit mi diye kontrol eder (peki == farki nedir =='hem adrese hem degere bakar fakat equals methodu sadece degere bakar)
            equalsIgnoreCase : buyuk kucuk harf farketmeksizin esit mi diye kontrol eder.
            indexOf : girilen karakterin ilk indexini dondurur.
            lastIndexOf : girilen karakterin son indexini dondur.
            chartAt : girilen indexteki karakteri dondorur.
            trim : bastaki ve sondaki bosluklari siler.
            split : icine girilen degerden boler sag ve sol olmak uzere secim yaptirir (0 sol/1 sag).
            replace : icindeki datayi degistermeyi saglar.
            replaceAll : icindeki datayi gruplar halinde(regex) degistermeyi saglar
            concat : birlestirme islemi yapar
            subString : ilk girilen indexten ikinci indexe kadar (ikinci index dahil degildir) olan degeri bize dondurur.
            valueOf : String'i baska dataya baska datayi da String'e cevirmeyi saglar.
            contains : icerme durumunu kontrol eder.
            endsWith : ne ile bittigini kontrol eder.
            startsWith : ne ile basladigini kontrol eder.
            isBlank : hem bos mu diye kontrol eder bos degilse sadece bosluk karakter var mi diye kontrol eder.
            isEmpty : bos mu diye kontrol eder.
         */

            /*
                 Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
                 karakter sayısının toplamını yazdırınız.
         */

        String  name1="A H M E T";
        String  name2="A L I C A N";
        String  name3="M E H M E T";

        System.out.println(name1.replace(" ","").length()+name2.replace(" ","").length()+name3.replace(" ","").length());

        // length() method unu benden 3 degiskenim karakter sayilarinin toplamını istedigi icin kullandım.
        // length-1 method u bana son index i vercegi icin benim icin yanlis bir secim olmaktadir.

    }
}
