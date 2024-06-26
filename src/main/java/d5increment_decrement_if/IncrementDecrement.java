package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5;
        a = a + 2;
        a += 2;

        //Decrement
        int c = 10;
        c = c - 3;
        c -= 4;

        int d = 6;
        d = d * 2;
        d *= 2;

        int f = 13;
        f = f + 1;
        f += 1;
        f++;


        int h = 15;
        h = h - 1;
        h -= 1;
        h--;

        //Post-Increment (i++), Pre-Increment (++i)
        int i = 10;
        int k=i++;

        int m=15;
        int n=++m;

        int p=17;
        int r=p--;

        int s=20;
        int t=--s;

    }
}
