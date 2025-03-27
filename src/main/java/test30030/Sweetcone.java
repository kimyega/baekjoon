package test30030;

import java.util.Scanner;

public class Sweetcone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        if (price < 1100 || price > 9900 || price % 11 != 0) return;

        int costPrice = price / 11 * 10;
        System.out.println(costPrice);

    }
}
