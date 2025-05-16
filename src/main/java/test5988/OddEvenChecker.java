package test5988;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OddEvenChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int caseNo = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseNo; i++) {
            String s = br.readLine();
            char c = s.charAt(s.length() - 1);
            list.add(c - '0');
        }

        list.stream()
                .map(n -> n % 2 == 0 ? "even" : "odd")
                .forEach(System.out::println);
    }
}
