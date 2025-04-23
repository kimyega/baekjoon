package test31867;

import java.io.*;

public class PairOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String num = br.readLine().trim();

        int pair = 0, odd = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 0) {
                pair++;
            } else {
                odd++;
            }
        }

        if (pair > odd) {
            bw.write("0");
        } else if (pair < odd) {
            bw.write("1");
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
