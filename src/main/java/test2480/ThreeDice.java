package test2480;

import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDice = sc.nextInt();
        int secondDice = sc.nextInt();
        int thirdDice = sc.nextInt();
        int prizeMoney = 0;

        if (firstDice == secondDice && firstDice == thirdDice) {
            prizeMoney = 10000 + firstDice * 1000;
        } else if (firstDice == secondDice) {
            prizeMoney = 1000 + firstDice * 100;
        } else if (secondDice == thirdDice) {
            prizeMoney = 1000 + secondDice * 100;
        } else if (thirdDice == firstDice) {
            prizeMoney = 1000 + thirdDice * 100;
        } else {
            prizeMoney = Math.max(firstDice, Math.max(secondDice, thirdDice)) * 100;
        }
        System.out.println(prizeMoney);
    }
}
