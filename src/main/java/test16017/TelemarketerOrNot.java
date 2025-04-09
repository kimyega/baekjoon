package test16017;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelemarketerOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            sb.append(br.readLine());
        }
        String s = sb.toString();

        String regex = "^[89][0-9][0-9][89]$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(sb.toString());

        if (m.matches() && s.charAt(1) == s.charAt(2)) {
            bw.write("ignore");
        } else {
            bw.write("answer");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
