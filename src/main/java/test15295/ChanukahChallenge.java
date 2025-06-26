package test15295;

import java.io.*;
import java.util.StringTokenizer;

public class ChanukahChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(k).append(" ").append(candleCount(n)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static int candleCount (int n) {
        int sum = 0;
        for (int i = 2; i <= n + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
