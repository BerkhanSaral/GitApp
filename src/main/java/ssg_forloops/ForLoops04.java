package ssg_forloops;

public class ForLoops04 {
    public static void main(String[] args) {
            String str = "alican bugun cok guzel java calisti";
            String bosStr = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) //girilen karakterin ilk indexinin i. karakteri ile sonkarakterin i.degerini karsilastiriyoruz
                {
                    bosStr+=str.charAt(i);
                }else {
                    System.out.println(str.charAt(i)+ " harfinden birden fazla var ");
                }
            }
            System.out.println(bosStr);

    }
}
