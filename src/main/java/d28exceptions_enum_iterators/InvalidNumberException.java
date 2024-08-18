package d28exceptions_enum_iterators;

public class InvalidNumberException extends RuntimeException {
    //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim.
    //Let’s go through the scenario that the number of students in a school cannot be negative

    //Exepsion yazilasydi compile time turunde olurdu ama simdi runtime turunde Exepsion
    public InvalidNumberException(String message) {
        super(message);
    }
}
