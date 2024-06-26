package EnginDemirog;

public class String_Ifadeler {
    public static void main(String[] args) {
        String mesaj = "bugun hava cok guzel";

        System.out.println("5.eleman : " + mesaj.charAt(4));

        System.out.println(mesaj.concat(" yarin bok gibi ama"));

        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2, 15));
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

    }
}
