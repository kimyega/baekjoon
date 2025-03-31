package test33515;

import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTime = sc.nextInt();
        int secondTime = sc.nextInt();
        if (firstTime < 0 || firstTime > 10000 || secondTime < 0 || secondTime > 10000) return;

        int resultTime = 0;
        if (firstTime >= secondTime) {
            resultTime = secondTime;
        } else {
            resultTime = firstTime;
        }
        System.out.println(resultTime);
    }
}
