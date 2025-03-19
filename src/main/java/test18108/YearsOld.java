package test18108;

import java.util.Scanner;

public class YearsOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1000 || year > 3000) {
            return;
        }
        int result = year - 543;
        System.out.println(result);
    }
}
