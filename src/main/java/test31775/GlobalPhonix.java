package test31775;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class GlobalPhonix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Character> initials = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            initials.add(s.charAt(0));
        }

        if (initials.contains('l') && initials.contains('k') && initials.contains('p')) {
            bw.write("GLOBAL");
        } else {
            bw.write("PONIX");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
