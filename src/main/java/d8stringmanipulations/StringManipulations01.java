package d8stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //Example 1: Convert the word “money” in String “s” to “dollar”.



        String a="learn java earn money";
        String finish=a.replace("money","dollar");
        System.out.println(finish);


//Ornek 2: “s” String’indeki tum “e” harflerini siliniz.
        //Example 2: Delete all “e” letters in the string “s”.

            String finish2=a.replaceAll("e","");
        System.out.println(finish2);







        /*


        //replace() methodu, 2.parametredekini 1.nin yerine koyar.
        //Kucuk buyuk harfe duyarlidir


        String s = "learn java earn money";
        String str = s.replace("money", "dollar");
        System.out.println(str);//learn java earn dollar

        //Ornek 2: “s” String’indeki tum “e” harflerini siliniz.
        //Example 2: Delete all “e” letters in the string “s”.

        String str2=s.replace("e","");
        System.out.println(str2);



*/

    }
}
