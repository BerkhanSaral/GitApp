package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        System.out.println(multiplay(5, 3));

        System.out.println(firstTwoMultiplyThirdAdd(4, 4, 2));

        print("ali can");

    }

    protected static int multiplay(int a, int b) {
        //protected: Bu class’tan erisilebilir.
        //Bir de sadece miras alinan class’lardan erisilebilir(extends)

        return a * b;

    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.

    //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class’lar erisemez


    private static int firstTwoMultiplyThirdAdd(int x, int y, int z) {
        return x * y + z;
    }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console
    //Eger bir method yeni bir data uretmiyor ise return type’i void olur.void ise return yazilmaz

    public static void print(String str) {

        System.out.println(str);
    }

}
