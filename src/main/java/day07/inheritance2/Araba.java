package day07.inheritance2;

public class Araba {

    protected String hareket = "arabalar tekerlek ile hareket eder";
    protected String hiz = "arabalar motur gucune gore hareket eder";
    protected String yakit = "arabalar farki turde yakit turune sahiptir";
    protected String marka = "arabalar uretildikleri firmanin markasina sahiptirler";

    protected void motor() {
        System.out.println("arablar farkli markalarda motorlara sahiptir");
    }

    protected void yakitTuketimi() {
        System.out.println("arablar yakit tuketir");
    }


}
