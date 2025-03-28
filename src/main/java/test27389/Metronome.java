package test27389;

import java.util.Scanner;

public class Metronome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ticks = sc.nextDouble();
        double keyTurns = ticks / 4;
        System.out.println(keyTurns);
    }
}
