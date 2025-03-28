package test30328;

import java.util.Scanner;

public class JavaWarriors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamNo = sc.nextInt();
        if (teamNo < 1 || teamNo > 20) return;

        int totalCost = teamNo * 4000;
        System.out.println(totalCost);
    }
}
