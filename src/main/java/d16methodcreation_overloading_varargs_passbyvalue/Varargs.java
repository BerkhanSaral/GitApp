package d16methodcreation_overloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {

        int result = add(3, 4, 6, 3, 7, 8, 5, 3, 6, 7, 4, 3, 7, 7, 4, 3, 2, 5);
        System.out.println(result);

        /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
        Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

        Varargs, aşağıdaki kurallara tabidir:

        1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
        Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
        main ici toplama(int... a, int... b) olmaz. toplama(int b, int... a) olur
        2- Varargs arka planda Array yapisini kullanir
        3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
        4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
        5- Varargs parametre, sıfır argüman alabilir. main ici toplama(); olabilir*/

    }
    /*
    public  static  int add1(int a,int b){
        return  a+b;
    }
    public static  int add2(int a,int b,int c){
        return  a+b+c;
    }*/

    public static int add(int... a) { //3 npltra koydugumuzda java varargs kabul eder
        int sum = 0;
        for (int w : a) {
            sum += w;

        }
        return sum;
    }
}
