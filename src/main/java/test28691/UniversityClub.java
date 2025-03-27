package test28691;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniversityClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial = sc.next();

        String regex = "^[MWCA\\$]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(initial);
        if (!matcher.matches()) return;

        switch (initial) {
            case "M" : System.out.println("MatKor");    break;
            case "W" : System.out.println("WiCys");    break;
            case "C" : System.out.println("CyKor");    break;
            case "A" : System.out.println("AlKor");    break;
            case "$" : System.out.println("$clear");    break;
            default : break;
        }
    }
}
