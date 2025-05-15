package test15953;

import java.io.*;
import java.util.StringTokenizer;

public class TreasureHunter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int[] ranks1 = {1, 2, 3, 4, 5, 6};
        int[] ranks2 = {1, 2, 4, 8, 16};
        int[] prizes1 = {500, 300, 200, 50, 30, 10};
        int[] prizes2 = {512, 256, 128, 64, 32};

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int myRank1 = Integer.parseInt(st.nextToken());
            int myRank2 = Integer.parseInt(st.nextToken());

            int prize1 = calculatePrize(myRank1, ranks1, prizes1);
            int prize2 = calculatePrize(myRank2, ranks2, prizes2);

            sb.append(prize1 + prize2 + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static int calculatePrize(int myRank, int[] ranks, int[] prizes) {
        int startRank = 1;

        for (int i = 0; i < prizes.length; i++) {
            int endRank = startRank + ranks[i] - 1;

            if (myRank >= startRank && myRank <= endRank) {
                return prizes[i] * 10000;
            }
            startRank = endRank + 1;
        }

        return 0;
    }
}
