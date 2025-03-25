package test15000;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Caps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String regex = "^[a-z]{1,1000000}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        if (!matcher.matches()) return;

        String result = line.toUpperCase();
        System.out.println(result);

    }
}
