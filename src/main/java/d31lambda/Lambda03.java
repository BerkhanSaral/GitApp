package d31lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        //int sum = getSumFromSeventoSeventy();
        //System.out.println(sum);
        //System.out.println(getMultiplicationFromThreeToNine1());
        //System.out.println(getMultiplicationFromThreeToNine2());
        //System.out.println(getFactorial(-1));
        System.out.println(getSumsOfBetweenTwoInteger(12, 5));
    }
    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //1) Write the code that returns the sum of all integers from 7 to 70

    /*
    a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
    b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
    temsil eden bir akış oluşturur.
    c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
    temsil eden bir akış oluşturur.
    d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
    e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
    Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
    */
    public static int getSumFromSeventoSeventy() {
        //Integer classtaki sum methodu
        //return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

        //Ekstra bilgi:
        OptionalInt result = IntStream.rangeClosed(7, 70).reduce(Math::addExact);

        if (result.isPresent()) { //varmi- mevcutmu //veri varmi yokmu kontrolu yapiyoruz
            return result.getAsInt();
        } else {
            throw new RuntimeException("Beklenmedik bir hata olustu");
        }
        //Integer::sum ile Math::addExact toplama yapar, peki farklari nedir?
        //2147483647 + 1 ==> tasma olur > exception firlatir. Math::addExact tasma kontrolu yapar


        //Integer::sum: Taşma kontrolü yapmaz ve int sınırlarını aşan sonuçlar dönebilir.
// Kullanımı daha basittir ama taşma durumlarında dikkatli olunmalıdır.
//Math::addExact: Taşma kontrolü yapar ve taşma meydana geldiğinde ArithmeticException fırlatır.
// Bu, güvenli bir toplama işlemi sağlar ve taşma hatalarını tespit etmeye yardımcı olur.
//Her iki metod da toplama işlemi yapar, ancak Math::addExact taşma kontrolü yaparak daha güvenli bir yaklaşım sunar.
    }

    //-----------------------
    //2) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //2) Create a method that multiplies all integers from 3 to 9.
    public static int getMultiplicationFromThreeToNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    }

    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
    }
    //---------------
    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3)Write the code that calculates the factorial of the given number.
    //3! = 1 * 2 * 3 = 6
    //0! = 1
    //Negatif sayıların faktöriyeli yoktur

    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("0`dan kucuk olamaz");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();

        }
    }


    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //4)Write the code that gives you the sum of all even numbers between two given integers.
    //beginning and ending are not included.//4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //4)Write the code that gives you the sum of all even numbers between two given integers.
    //beginning and ending are not included.

    //sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.
    public static int getSumsOfBetweenTwoInteger(int x, int y) {
        //Yer degistirme algoritmasi x=12,y=5
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }





        return IntStream.range(x + 1, y).filter(Utils::isNumberEven).sum();
    }


}
