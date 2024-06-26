package day07.inheritance;

public class Runner {
    public static void main(String[] args) {
        Parent testObj=new Parent(15);
        System.out.println(testObj.yas);

        Parent obj=new Parent();
        System.out.println(obj.yas);

        Child child=new Child();
        System.out.println(child.yas);

        Parent testObj2=new Child();
        //elimizde bir iphone 8 olsu n bu iphine 8`in icindeki uygulamalari guncel olarak kullanabiliriz
        //fakat iphone 9`in kamera saisini degistiremeyiz

        System.out.println(testObj2.yas); //parenttaki geldi cunku variable`lar override edilemez
        testObj2.method3();
        testObj2.method4(); //child cunklu ovverride edildi daha guncel hali var


    }
}
