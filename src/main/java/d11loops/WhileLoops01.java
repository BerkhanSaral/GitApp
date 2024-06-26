package d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {

        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }
        System.out.println();
        int i = 3;
        while (i < 7) {
            System.out.println(i);
            i++;
        }

        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console’a yazdiriniz(12 dahil).
        //Example 2: Write the even integers from 23 to 12 to the console (including 12)

        int k = 23;

        while (k > 11) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k--;
        }

    }
}
