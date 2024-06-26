package day07.inheritance2;

public class Corsa extends Opel {

    protected String hiz="Corsa arablar max hiz 200 km";
    protected String yakit="Corsa arablar LPG`lidir";
    protected String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci mootor kullanir");
    }

    protected void vites () {
        System.out.println("Corsa arablar 5 viteslidir");
    }
}
