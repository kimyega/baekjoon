package test30031;

import java.io.*;
import java.util.StringTokenizer;

public class MoneyCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int wdt = Integer.parseInt(st.nextToken());
            int hgt = Integer.parseInt(st.nextToken());

            if (wdt == 136) {
                sum += 1000;
            } else if (wdt == 142) {
                sum += 5000;
            } else if (wdt == 148) {
                sum += 10000;
            } else if (wdt == 154) {
                sum += 50000;
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
