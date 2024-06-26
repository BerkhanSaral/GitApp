package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Ornek 1:  Bir String ArrayList oluşturun ve “a” içeren elemanlari silin.
        //Example 1: Create a String ArrayList and delete the elements containing “a”.


        /*for each kullandiginizda list'lerde eleman sayisini azaltamazsiniz.

        Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
        boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ
        eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
        Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

        Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur.
        Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa,
        siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur */


        List<String> a = new ArrayList<>();
        a.add("Manisa");
        a.add("Nigde");
        a.add("Tokat");
        a.add("Van");

      /*  for (String w : a) {
            if (w.contains("a")) {
                a.remove(w);
            }
        }
        System.out.println(a);*/

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).contains("a")) {
                a.remove(i);
                i--;
            }
        }
        System.out.println(a);


        //ODEV: Bu soruyu i'yi son index'ten baslatarak ta cozebilirdik.i-- yazmaya
        // gerek kalmazdi. Nasil?

        for (int i = a.size() - 1; i > 0; i--) {
            if (a.get(i).contains("a")) {
                a.remove(i);
            }
        }
        System.out.println(a);
    }
}
