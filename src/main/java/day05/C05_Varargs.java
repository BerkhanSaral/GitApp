package day05;

public class C05_Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun
        String str1 = "Ali";
        String str2 = "Ridvan";
        String str3 = "Aysel";
        String str4 = "Kerem";
        String str5 = "Mustafa";
        String str6 = "Mehmet";
        enUzunKelimeYazdir(str1, str2, str3, str4, str5, str6);
    }

    private static void enUzunKelimeYazdir(String... str) {
        String enUzunKelime = "";

        for (String each : str) {
            if (enUzunKelime.length() < each.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
