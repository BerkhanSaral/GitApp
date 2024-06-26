package d30lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        firstIndexE(myList);
    }

    //ornek 9: Bir listedeki “E” harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
    //example 9: Create a method that prints to the console all items in a list that do not start with the letter “E”.
    public static void firstIndexE(List<String> myList) {
        //myList.stream().distinct().filter(t->!t.contains("E")).forEach(t-> System.out.println(t+ " "));
        myList.stream().distinct().filter(t -> !t.startsWith("E")).forEach(t -> System.out.println(t + " "));
    }
}
