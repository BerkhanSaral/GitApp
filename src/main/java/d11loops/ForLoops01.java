package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 6; i < 11; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum); //sum = 40

        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console’a yazdiriniz.
        //example 2: Write the product of all int’s from 10 to 7 to the console
        //      10x9x8x7 ==> 5040
        int multiply=1;
        for (int i = 10; i >6 ; i--) {
            multiply*=i;
        }
        System.out.println(multiply);


    }
}
