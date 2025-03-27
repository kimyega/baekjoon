package test30676;

import java.util.Scanner;

public class StarColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starWave = sc.nextInt();
        if (starWave < 380 || starWave > 780) return;
        else if (starWave < 425) System.out.println("Violet");
        else if (starWave < 450) System.out.println("Indigo");
        else if (starWave < 495) System.out.println("Blue");
        else if (starWave < 570) System.out.println("Green");
        else if (starWave < 590) System.out.println("Yellow");
        else if (starWave < 620) System.out.println("Orange");
        else System.out.println("Red");

    }
}
