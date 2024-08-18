package d28exceptions_enum_iterators;

public class ExceptionRunner {
    public static void main(String[] args) {
        studentGrade(-55);
    }

    public static void studentGrade(int not) {
        if (not < 0 || not > 100) {
            try {
                throw new InvalidStudentGradeException("Ogrenci notu 0`dan kucuk ve 100`den buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(not);
        }

    }
}

