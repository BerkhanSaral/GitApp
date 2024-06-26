package d9stringloops;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail
        //Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        String b = "abc@deneme.com";
        String left=b.split("@")[1].split("\\.")[0];
        System.out.println(left);


//3.yol Dinamik
        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir


        int indexOf=b.indexOf("@");
        int indexOf2=b.lastIndexOf(".");
        System.out.println(indexOf);
        System.out.println(indexOf2);
        String finish=b.substring(indexOf+1,indexOf2);
        System.out.println(finish);






/*
        //1.yol Hard coding -static code- tavsiye edilmez

        String a = "abc@google.com";
        System.out.println(a.substring(4, 9));

        //2.yol Dinamik

        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1);

        //3.yol Dinamik
        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        int startingIndex = a.indexOf("@");
        int endingIndex = a.indexOf(".");

        String companyName = a.substring(startingIndex+1, endingIndex);
        System.out.println(companyName);
*/

    }
}
