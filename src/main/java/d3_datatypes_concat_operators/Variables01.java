package d3_datatypes_concat_operators;

public class Variables01 {
    public static void main(String[] args) {
        float sockPrice1 = 12.99f;
        float shirtPrice1 = 25.99f;
        //System.out.println("Total Price:"+(sockPrice1+shirtPrice1));

        float sockPrice2 = 12.99f, shirtPrice2 = 25.99f;
        System.out.println("Total Price-2:" + (sockPrice2 + shirtPrice2));

        System.out.println("Total Price-3:" + (3 * sockPrice1 + 2 * shirtPrice1));

        double collWeight=0.0000000020;
        System.out.println(collWeight);

        char firstLetterOfTheName='B';
        System.out.println(firstLetterOfTheName);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println("------------");
        System.out.println(b1 && b2); //false
        System.out.println(b2 || b3); //true
        System.out.println(b2 && b4); //false
        System.out.println(b3 || b4); //true

    }


}
