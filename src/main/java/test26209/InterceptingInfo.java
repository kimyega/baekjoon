package test26209;

import java.util.Scanner;

public class InterceptingInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "S";
        for (int i = 0; i < 8; i++) {
            int bit = sc.nextInt();
            if (bit != 1 && bit != 0 && bit != 9) return;
            else if (bit == 9) {
                result = "F";
            }
        }
        System.out.println(result);
    }
}
