package test6378;

import java.io.*;
import java.util.StringJoiner;

public class DigitalRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringJoiner sj = new StringJoiner("\n");

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;

            while (s.length() != 1) {
                int dr = 0;

                for (char c : s.toCharArray()) {
                    dr += c - '0';
                }

                s = dr + "";
            }

            sj.add(s);
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
