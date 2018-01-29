package TheSimplestSum;

import java.util.*;

public class Solution {

    static int simplestSum(int k, int a, int b) {
        // Complete this function
        int sum = 0;

        while (a<=b) {
            sum += getSum(k, a);
            a++;
        }
        return sum;
    }

    private static int getSum(int k, int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
            i *= k;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int result = simplestSum(k, a, b);
            System.out.println(result);
        }
        in.close();
    }
}
