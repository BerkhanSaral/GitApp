package practice04;

import java.util.ArrayList;
import java.util.List;

public class C04OrtakIslemler {
    public static void main(String[] args) {
        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitive olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : {brad,sofia,emily}
         */

        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily" };
        String[] secondArr = {"sofia", "brad", "grace", "emily", "hazel" };

        List<String> ortakIsimler = new ArrayList<>();


        for (String each1 : arr) {
            for (String each2 : secondArr) {
                if (each1.equalsIgnoreCase(each2))//buyuk kucuk harf uyumu goz etmez
                {
                    ortakIsimler.add(each1);
                }
            }
        }
        System.out.println(ortakIsimler);
    }
}
