package test31821;

import java.io.*;

public class LunchIsOnMe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalPrice = 0;
        int caseNo = Integer.parseInt(br.readLine());
        int[] prices = new int[caseNo];

        for (int i = 0; i < caseNo; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        int personNo = Integer.parseInt(br.readLine());

        for (int i = 0; i < personNo; i++) {
            int n = Integer.parseInt(br.readLine());
            totalPrice += prices[n - 1];
        }

        bw.write(totalPrice + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
