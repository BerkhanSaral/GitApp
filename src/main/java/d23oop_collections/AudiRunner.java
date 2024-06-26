package d23oop_collections;

import d22oop.AudiS5;

public class AudiRunner {
    public static void main(String[] args) {
        //Engine e = new Engine(); Soyut bir yapidan object uretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir

        //Brake s5 = new AudiS5();
        //s5.abs();

        //a4.run(); //Audi A4 havayastigi calistirir
        ((Engine)a4).run(); //Audi A4 havayastigi calistirir
        //Engine interface'inden gelen run() methodu calisti

        // Engine.price=5000; //final oldugunan dolayi yeni deger atilamiyor

        System.out.println(Engine.fiyat);
        System.out.println(AC.fiyat);
        System.out.println(Break.fiyat);

        Engine.speed();
        a4.power();


    }
}