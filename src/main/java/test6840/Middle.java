package test6840;

import java.util.Arrays;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bowls = new int[3];

        for (int i = 0; i < 3; i++) {
            bowls[i] = sc.nextInt();
        }
        Arrays.sort(bowls);
        int result = bowls[bowls.length / 2];
        System.out.println(result);
    }
}
