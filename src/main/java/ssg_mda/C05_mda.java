package ssg_mda;

public class C05_mda {
    public static void main(String[] args) {
         /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */

       /* int[][] arr = {{1, 2, 3}, {4, 5}, {6, 0}};
        int[] newArr = new int[arr.length];
        int carp = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int a : arr[i]) {
                carp *= a;
            }
            newArr[i]=carp;
            carp = 1;
            System.out.println(Arrays.toString(newArr));
        }*/




/*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */


        /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */

        int[][] arr = {{10, 12, 3}, {76, 35}, {68, 102}};
        int toplam = 0;
        int ort = 0;
        for (int[] w : arr) {
            for (int k : w) {
                toplam += k;
            }
        }
    }
}
