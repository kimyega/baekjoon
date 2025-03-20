package test2744;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String regex = "[a-zA-Z]{1,100}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

    }
}
