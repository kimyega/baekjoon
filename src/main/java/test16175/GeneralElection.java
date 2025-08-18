package test16175;

import java.io.*;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class GeneralElection {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());


        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] votes = new int[n];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    votes[j] += Integer.parseInt(st.nextToken());
                }
            }


            int winner = IntStream.range(0, votes.length)
                    .boxed()
                    .max(Comparator.comparingInt(i -> votes[i]))
                    .orElse(0) + 1;

            sb.append(winner).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
