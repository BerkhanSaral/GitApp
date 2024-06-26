package day07.encapsulation;

public class Student {

    private String isim;
    private String soyisim;
    private int yas;

    public Student() {

    }

    public Student(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
    //getter:okuma goruntuleme
    //setter:degistirme guncelleme
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
}
