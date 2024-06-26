package operations_concatenations03;

import java.util.Locale;
import java.util.Scanner;

public class C01_operations {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in).useLocale(Locale.US);

        double s1=5.6;
        double s2=6.7;
        System.out.println("Toplamlari:"+(s1+s2));
        System.out.println("Farklari:"+(s1-s2));
        System.out.println("Carpimlari:"+s1*s2);
        System.out.println("Bolumleri:"+s1/s2);
        System.out.println("Mod-1:"+s1%s2);
        System.out.println("Mod-2:"+s2%s1);
        System.out.println("Birbirinin ussu:"+Math.pow(s1,s2));//ust alma
        System.out.println("Birbirinin ussu:"+Math.pow(s2,s1));//ust alma

    }
}
