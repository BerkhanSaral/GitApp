package ssg_stringmanipulations;

public class stringManipulations03 {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz
        //ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.

        String str=" A hme t ";

        str=str.trim();
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(str.length()-1));
    }
}
