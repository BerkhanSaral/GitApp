package day07.inheritance2;

public class Opel extends Araba {

    protected String hiz = "opel arabalar max 220 km hiz yapar";
    protected String marka = "Opel";
    protected String sirketMerkezi = "Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arablari opel marka motor kullanir");
    }

    protected void yakitTuketimi() {
        System.out.println("Opel arabalar cok az yakit tuketir");
    }

    protected void fren() {
        System.out.println("Opel arabalar abs ozelligi kullanir");
    }

}
