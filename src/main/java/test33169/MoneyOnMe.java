package test33169;

import java.util.Scanner;

public class MoneyOnMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thousCount = sc.nextInt();
        int tenThousCount = sc.nextInt();
        if (thousCount < 1 || thousCount > 100 || tenThousCount < 1 || tenThousCount > 100) return;

        int result = thousCount * 1000 + tenThousCount * 10000;
        System.out.println(result);
    }
}
