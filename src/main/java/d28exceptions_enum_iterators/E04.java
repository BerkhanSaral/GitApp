package d28exceptions_enum_iterators;

public class E04 {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        int[] c = {3, 5, 7, 9};
        bring(c, a, b);
    }

    public static void bring(int[] c, int a, int b) {
        try {
            int idx = a / b; //a`nin b`ye bolunmeme durumunda ArithmeticException
            int element = c[idx]; //idx`de olan indexin c`de olmama durumunda StringIndexOutOfBoundsException
            System.out.println(element);
        } finally {
            System.out.println("Database ile baglantiyi kesiniz~");
        }
        System.out.println("Finally sonrasi app calisir");
    }
}
