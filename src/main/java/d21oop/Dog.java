package d21oop;

public class Dog extends Mammal {
    public void bark() {
        System.out.println("dogs bark");
    }

    @Override
    public void eat() {
        System.out.println("dogs eat....");
    }

    //Child parent`in data tipini kullanabilir
    @Override
    public Animal create() {
        return new Dog();
    }

    //primitive'lerde parent child iliskisi yoktur.
    //primitive'ler de return type degistirilmez
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b;
    }

}

