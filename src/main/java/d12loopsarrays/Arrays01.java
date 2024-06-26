package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
                /*
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
            bir String dizisi sadece String değerler saklayabilir.
            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
            6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
        */

        String[] stdNames1 = new String[3];
        //String stdNames2=new String[4];
        System.out.println(Arrays.toString(stdNames1));

        //ornek 1: 5 elemanli notes adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar));

        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.
        Integer[] integer = new Integer[10];
        System.out.println(Arrays.toString(integer));

        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] names = new String[3];
        names[0] = "ali can";
        names[1] = "Berkhan Saral";
        names[2] = "Ayse Hanim";
        System.out.println(Arrays.toString(names));
        System.out.println(names[1]);
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.
        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] citys = new String[5];
        citys[0] = "Izmir";
        citys[1] = "Ankara";
        citys[2] = "Trabzon";
        citys[3] = "Istanbul";
        citys[4] = "Antalya";

        int totoalChar = 0;
        for (int i = 0; i < citys.length; i++) { //field =alan diye gecer dinamik sayma yapmaz alan okumasi yapar
            totoalChar = totoalChar + citys[i].length(); //metot olan length dinamiktir
        }
        System.out.println(totoalChar);
        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir.
/*
        for (DataType variable:Array_yada collections){

        }
*/
        int sum=0;
        for (String w:citys){
            sum=sum+w.length();
        }
        System.out.println(sum);


    }
}
