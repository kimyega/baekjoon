package test10103;

import java.io.*;
import java.util.StringTokenizer;

public class DiceGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int chgYng = 100, sngDk = 100;
        StringTokenizer st;

        int rounds = Integer.parseInt(br.readLine());

        while (rounds-- > 0) {
            st = new StringTokenizer(br.readLine());
            int chg = Integer.parseInt(st.nextToken());
            int sng = Integer.parseInt(st.nextToken());

            if (chg < sng) {
                chgYng -= sng;
            } else if (chg > sng) {
                sngDk -= chg;
            }
        }

        bw.write(chgYng + "\n" + sngDk);

        bw.flush();
        bw.close();
        br.close();
    }
}
