package ssg_mda;

public class C03_mda {
    public static void main(String[] args) {

       /*
soru 3) Verilen 2 katli bir multi-dimensional array'de
outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
*/
        int[][] nums = {{2,4,6,8}, {1,3,5,7}, {10,20,30}};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j) {
                    total += nums[i][j];
                }
            }
        }
        System.out.println(total);
    }
}
