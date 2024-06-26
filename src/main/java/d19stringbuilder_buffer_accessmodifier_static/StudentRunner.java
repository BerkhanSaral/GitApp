package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {
        //Student class`tan bir tane instance olusturalim

        Student ali = new Student();
        System.out.println(ali.stdName);
        System.out.println(ali.email);
        System.out.println(ali.address);
        System.out.println(ali); //tostring() olmayinca referance geliyor
        System.out.println(ali);
    }
}