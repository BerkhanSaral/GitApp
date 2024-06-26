package d28exceptions_enum_iterators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
        //Not: Bir onceki uygulamamizda method signature icine exception eklemesi yaptik.
        // Bu seferde try-catch kullanalim

        try {
            FileInputStream fis = new FileInputStream("src/main/java/d27exceptions/file.txt");


            int k = 0; //okunan degerleri bunun icinde saklicaz

            while ((k = fis.read()) != -1) { //read default olarak -1 donduruyor en son r harfide
                // yazildiktan sonra read() den k ya -1 atancak -1 != -1 false doncek ve cikicak
                System.out.print((char) k);
            }

        }  catch (IOException e) {
            System.out.println(e.getMessage());  //(The system cannot find the path specified)
        }

    }
}
