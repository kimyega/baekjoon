package test27866;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String voca = sc.nextLine();

        String regex = "^[a-zA-Z]{1,1000}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(voca);

        if (!matcher.matches()) {
            return;
        }

        int num = sc.nextInt();
        if(num < 0 || num > voca.length()) {
            return;
        }

        char result = voca.charAt(num - 1);
        System.out.println(result);

    }
}
