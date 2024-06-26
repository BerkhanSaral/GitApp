package d17constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {
        //4-Car class'indan bir object uretelim //9-default constructor icine parametre girelim
        Car c1 = new Car("BMW", "3.20", 2024, false);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.actions();
        c1.stop();

        //5-CarRunner class`a gidelim

        //10- Car class`indan bir object daha uretelim
        Car c2 = new Car("Audi", "A4", 2019, true);
        System.out.println(c1);
        System.out.println(c2);

        //11- Objeleri direk okunur hale getirmek icin Car class`dan tostring methodunu kullanalim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //14- Car class`indan bir object daha uretelim
        Car c3=new Car("Tofas","Sahin");
        System.out.println(c3);


    }

}
