package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {
        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        //Example 1: Find the total price of the following products.
        //String tv = “$456.99”; String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        //valueOf() : Belirtilen String’i Double’a cevirir


        String tv = "$456.99";
        String laptop = "$875.99";

        String first=tv.replace("$","");
        String second=laptop.replace("$","");
        System.out.println(first);
        System.out.println(second);

        Double sum=Double.parseDouble(first)+Double.parseDouble(second);
        System.out.println(sum);














        /*
        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.parseDouble(tv) + Double.valueOf(laptop);//bastaki Double double olur ama unboxing oldugunda dolayi java yi yorariz ondan dolayi Double yapiyoruz
        System.out.println(totalPrice);


        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        String name = "   ali     cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println(first +""+ last);
*/

    }
}
