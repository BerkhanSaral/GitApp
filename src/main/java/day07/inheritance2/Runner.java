package day07.inheritance2;

public class Runner {
    public static void main(String[] args) {
        Corsa araba1=new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket);

        System.out.println("araba1.marka = " + araba1.marka);

        System.out.println("araba1.hiz = " + araba1.hiz);

        araba1.motor();
        araba1.yakitTuketimi();

        //Parent Child
        Opel araba2=new Corsa();
        //Corsa objesi olusturmayi saglar ama data turu olarak olarak Opel olur
        //opel in aktif ve pasif butun ozellilerini tasir fakat aktiflerden
        // guncellenmis hali varsa gunceli alir
        System.out.println("araba2.hareket = " + araba2.hareket);
        System.out.println("araba2.hiz = " + araba2.hiz);
        araba2.motor();

        Araba araba3=new Corsa(); //Data tipi Araba (sol tarafta yazan data tipi)
        System.out.println("araba3.hareket = " + araba3.hareket);
        System.out.println("araba3.hiz = " + araba3.hiz);
        //araba3.model(); araba classinin iinde yok

        araba3.motor();
        araba3.yakitTuketimi();

    }

}
