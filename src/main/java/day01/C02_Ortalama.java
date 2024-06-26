package day01;

public class C02_Ortalama {
    public static void main(String[] args) {

        double num1 = 20.5;
        double num2 = 24.4;
        double num3 = 10.2;
        double num4 = 550;
        double num5 = 95;

        // Yukaridaki sayilarin ortalamasini bulan kodu yaziniz.
        // Tum sayilari toplayin, sayi adedine bolun

        double toplam=num1+num2+num3+num4+num5;
        System.out.println("toplam = " + toplam);
        System.out.println("Ortalama = " + toplam/5);

        double ortalama=toplam/5;
        System.out.println("ortalama = " + ortalama);

        System.out.println("Ortalama"+(num1+num2+num3+num4+num5)/5);
    }
}
