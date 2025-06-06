package test17174;

import java.io.*;
import java.util.StringTokenizer;

public class TotalCalculationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        bw.write(countMoney(n, m) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int countMoney(int n, int m) {
        return n == 0 ? 0 : n + countMoney(n / m, m);
    }
}
