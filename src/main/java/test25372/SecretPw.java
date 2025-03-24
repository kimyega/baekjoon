package test25372;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretPw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        sc.nextLine();

        String regex = "^[a-zA-Z0-9]{6,9}$";
        Pattern pattern = Pattern.compile(regex);
        String[] results = new String[caseNo];

        for (int i = 0; i < caseNo; i++) {
            String password = sc.nextLine().trim();
            Matcher matcher = pattern.matcher(password);
            if (!matcher.matches()) {
                results[i] = "no";
            } else {
                results[i] = "yes";
            }
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
