package day06;

public class C03_StaticKeyword {
    int istanceSayi = 5; //default olarak class icinde instance olarak olusuyor

    static int staticSayi = 10;

    //local variabe olusturamam cunku local variable bur methodun icinde ihtiyac halinde olusturulan bir yapi

    //bu kisimda loop variable olusmaz cunku looplar methodlar icinde olusturulabilir

    public String method1() {
        String str = "Instance Method";
        return str;
    }

    public static void method2() {
        System.out.println("static Method");
    }

    public static void main(String[] args) {
        //instance variable lar ya da instance methodlar daima bir obje`ye baglidir
        C03_StaticKeyword obj1 = new C03_StaticKeyword();
        obj1.istanceSayi = 20;
        System.out.println(obj1.istanceSayi);

        //static variable ya da static methodlar daima bir class`a baglidir
        C03_StaticKeyword.staticSayi = 30;
        obj1.staticSayi = 25;
        System.out.println(obj1.staticSayi);
        C03_StaticKeyword.method2();

        System.out.println("-------------------------");
        C03_StaticKeyword obj2=new C03_StaticKeyword();
        obj2.istanceSayi=50;
        System.out.println(obj2.istanceSayi);//objeler icindeki degisiklik sadece objelerde gecerli
        System.out.println(obj2.staticSayi);

        int toplam=0;
        toplam=obj1.istanceSayi+ obj2.istanceSayi+C03_StaticKeyword.staticSayi;
        System.out.println(toplam);



    }

}
