package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.
    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;

    //Instance block
    {
        color = "siyah";//her otomobil varsayilan olarak siyah renkte baslar
        fuelType = "Benzin"; //varsayilan benzin turu benzin olarak ayarlanir
    }

    public InstanceBlock3() {
        System.out.println("araba rengi : " + color);
        System.out.println("araba yakit turu : " + fuelType);
    }

    public InstanceBlock3(String fuelType, String color) {
        this.fuelType = fuelType;
        this.color = color;
    }
}
