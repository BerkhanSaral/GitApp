package d22oop;

public class AudiS5 implements Break,Engine,AC{

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
}
