package test26489;

import java.util.Scanner;

public class GumGum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            if (line.equals("gum gum for jay jay")) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
