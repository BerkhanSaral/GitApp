package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 obj1 = new InstanceBlock3();
        InstanceBlock3 obj2 = new InstanceBlock3("dizel", "pembe");
        System.out.println("araba rengi : " + obj2.color);
        System.out.println("araba yakit tipi : " + obj2.fuelType);
    }
}
