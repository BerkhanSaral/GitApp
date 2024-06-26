package day06;

public class C2_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(7);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("Hava guzel");
        System.out.println(sb);

        int boslukIndex = sb.indexOf(" ");
        sb.deleteCharAt(boslukIndex);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(sb.length() - 4, sb.length());
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.insert(0, "Java");
        System.out.println(sb);

        //sb.replace(0, 0, "Java");
        //System.out.println(sb);

        //int bosluk=sb.indexOf(" ");
        sb.insert(4, " ");
        System.out.println(sb);
        //sb.insert(sb.length() - 1, "di bugun");


        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
