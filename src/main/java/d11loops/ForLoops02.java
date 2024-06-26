package d11loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
Example 1: Write the code to give the following output
            Week: 1
                Day: 1
                Day: 2
                Day: 3
                .....
            Week: 2
                Day: 1
                Day: 2
                Day: 3
                ....    */

        for (int i = 1; i < 5; i++) {

            System.out.println("Week:"+i);/*
            System.out.println("Day 1");
            System.out.println("Day 2");
            System.out.println("Day 3");
            System.out.println("Day 4");
            System.out.println("Day 5");
            System.out.println("Day 6");
            System.out.println("Day 7");
*/
            for (int j = 1; j < 8; j++) {
                System.out.println("Day"+j);
            }
        }
    }
}
