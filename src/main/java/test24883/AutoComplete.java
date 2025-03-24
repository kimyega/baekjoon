package test24883;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoComplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        String regex = "^[a-zA-Z]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(alpha);
        if (!matcher.matches()) return;

        if (alpha.equals("N") || alpha.equals("n")) {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }

    }
}
