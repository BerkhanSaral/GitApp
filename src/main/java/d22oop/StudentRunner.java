package d22oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s.name = " + s.name);

        System.out.println(s.getAge());
        System.out.println(s.isSuccessful());

        s.setAge(24);
        System.out.println(s.getAge());

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());

        //Arastirma Odevi: Kullanici bazinda erisim kontrolu nedir?
        //RBAC, AOP

        //Encapsulation’da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.
        //getter ve setter metodlarına sahip class’lar sıkça JavaBeans olarak da adlandırılır.
        // (Java bean aslinda ozel bir class turudur.)

        //Soru 1:  encapsulation’da set ile verileri degistirebiliyoruz. constructorlar ile de degistirebiliyoruz. Farki nedir?

        //Soru 2: set method birkac parametre alir mi? ==TRUE

        //Soru 3: encapsulation da private ile gizlenen bir veri baska package’dan set method ile degistirilebilir mi?













    }
}
