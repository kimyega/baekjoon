package test21146;

import java.io.*;
import java.util.StringTokenizer;

public class RatingProblems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double minScore, maxScore, sum = 0;

        for (int i = 0; i < k; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += score;
        }

        minScore = (sum + (n - k) * -3) / n;
        maxScore = (sum + (n - k) * 3) / n;

        bw.write(minScore + " " + maxScore);

        bw.flush();
        bw.close();
        br.close();
    }
}
