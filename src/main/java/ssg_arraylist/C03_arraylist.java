package ssg_arraylist;

import java.util.ArrayList;

public class C03_arraylist {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        int sum=0;
        for (Integer w : num) {
            sum+=w;
        }
        System.out.println(sum);
    }
}
