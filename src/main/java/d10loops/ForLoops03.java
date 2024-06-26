package d10loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console
        //      578 ==> 5+7+8=20 ==> Output 20 olmali

        int sum=0;
        for (int i = 578; i >0 ; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println("sum = " + sum);
        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf

        String s="Yusuf";
        String unique="";

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);

            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                unique=unique+ch;
            }
        }
        System.out.print(unique);
    }
}
