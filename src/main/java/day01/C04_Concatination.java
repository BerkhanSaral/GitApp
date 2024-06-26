package day01;

public class C04_Concatination {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        System.out.println(str1 + sayi1);
        System.out.println(str1 + (sayi1 + sayi2) + str2);

        System.out.println("Sonuc" + (sayi1 - sayi2) + str2 + (sayi1 * sayi2));

        System.out.println(str1 + (sayi1 * 5 - sayi2));
        System.out.println(str1 + (sayi1 - sayi2) + (sayi1 - sayi2));

        String str3 = "Ali";
        String str4 = "Can";
        String str5 = "Javayı";
        String str6 = "bugun";
        String str7 = "tam";
        String str8 = "anlamıyla";
        String str9 = "ogrendi";
        System.out.println(str3 + " " + str4 + " " + str5 + " " + str6 +" "+ +(sayi1 + sayi2) + " yil sonra " + str7 + " " + str8  +  " " + str9);
    }
}
