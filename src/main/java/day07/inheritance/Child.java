package day07.inheritance;

public class Child extends Parent {

    int yas = 5;

    @Override
    protected void method4() {//override islemi oluyor burda parent da olan method4 childe da guncellendi
        System.out.println("Method 4 yas : " + this.yas);
    }

    public static void main(String[] args) {
        System.out.println(Parent.isim);
        System.out.println(isim);

        Parent.method2();
        method1();

        Parent parent = new Parent();
        System.out.println(parent.yas);

        Child child = new Child();
        System.out.println(child.yas);

        Parent p = new Child(); //child objesi olusturmayi saglar ama data turu olarak olarak parent olur
        p.method4();

        parent.method3(); //Parent classtaki instance Method3
        parent.method4(); //Parent classtaki instance Method4
        child.method4(); //Method 4 yas : 5


    }
}
