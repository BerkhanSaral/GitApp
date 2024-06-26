package HomeWork;

public class Runner {
    public static void main(String[] args) {
        Student student=new Student(30);

        Student student2=new Student();
        student2.name="Ayse";
        student2.surname="Yilmaz";
        student2.age=-5;

        System.out.println(student.getName()+" "+student.getSurname()+" "+student.getAge());
        System.out.println(student2.getName()+" "+student2.getSurname()+" "+student2.getAge());




    }
}
