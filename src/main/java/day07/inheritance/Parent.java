package day07.inheritance;

public class Parent {

    protected static String isim = "Ali";
    protected String soyisim = "Can";

    protected static void method1() {
        System.out.println("Parent classtaki static Method1");
    }

    protected static void method2() {
        System.out.println("Parent classtaki static Method2");
    }

    protected int yas = 12;

    protected void method3() {
        System.out.println("Parent classtaki instance Method3");
    }

    protected void method4() {
        System.out.println("Parent classtaki instance Method4");
    }

    public Parent() {
    }

    public Parent(int yas) {
        this.isim = isim;
        this.yas = yas;
        this.soyisim = soyisim;
    }
}
