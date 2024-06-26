package d4casting_scanner_increment;

public class Operators {
    public static void main(String[] args) {
        int amountOfMoney = 25;
        int numberOfPeople = 10;
        System.out.println(amountOfMoney / numberOfPeople);

        double amountOfMoney2 = 25;
        int numberOfPeople2 = 10;
        System.out.println(amountOfMoney2 / numberOfPeople2);

        boolean a = 3 < 5;
        boolean b = 2 + 3 != 5;
        boolean c = 2 + 3 * 5 >= 19;
        System.out.println(a && b);
        System.out.println(a || b || c);
    }
}
