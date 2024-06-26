package d7ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        //Example : Write the code to check if the given number has 3 digits

        int num = -990;
        num=Math.abs(num); //mutlak degerini alip "+" yapar
        String result = num > 99 && num < 1000 ? "3 Basamakli" : "3 Basamli degil!";
        System.out.println(result);

    }
}
