package d23oop_collections;

public class AudiA4 implements Engine, AC, Break {
        /*
    a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir

    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class'i, Engine interface'i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class'i, Engine interface'i icindeki tum methodlari override etmek zorunda
    oldugundan method'larin bas kismina 'override' yazmak gerekmez ama tavsiye edilir.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */

    @Override
    public void gas() {
        System.out.println("Audi A4 gas  motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("Audi A4 turbo  motor kullanir");
    }

    @Override
    public void eco() {
        System.out.println("Audi A4 ekonomik  motor kullanir");
    }

    @Override
    public void esp() {
        System.out.println("Audi A4 esp fren  kullanir");
    }

    @Override
    public void abs() {
        System.out.println("Audi A4 abs fren  kullanir");
    }

    @Override
    public void dijital() {
        System.out.println("Audi A4 dijital klima   kullanir");
    }

    @Override
    public void analog() {
        System.out.println("Audi A4 analog klima   kullanir");
    }

//ODEV: AudiS5 class'i olusturup, 3 interface'i de parent'i yapiniz}

    @Override
    public void run() {
        System.out.println("Audi A4 hava yastigi calistirir");
    }


}
