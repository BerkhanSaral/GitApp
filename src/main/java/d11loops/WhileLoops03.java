package d11loops;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //      Palindrome: 121 <==> 121    123321 <==> 123321

        int k=313;

        String original=String.valueOf(k);
        String reversed="";

        int index=original.length()-1;
        while (index>=0){
            reversed=reversed+original.charAt(index);
            index--;
        }
        System.out.println(reversed);

        if (original.equals(reversed)){
            System.out.println("palindrome`dur");
        }
        else {
            System.out.println("palindrome degildir ");

        }
    }
}
