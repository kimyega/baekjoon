package test28235;

import java.util.Scanner;

public class CodeMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cheer = sc.nextLine().trim();
        switch (cheer) {
            case "SONGDO":
                System.out.println("HIGHSCHOOL"); break;
            case "CODE":
                System.out.println("MASTER"); break;
            case "2023":
                System.out.println("0611"); break;
            case "ALGORITHM":
                System.out.println("CONTEST"); break;
            default: break;
        }
        sc.close();
    }
}
