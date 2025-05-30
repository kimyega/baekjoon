package test21866;

import java.io.*;
import java.util.StringTokenizer;

public class CoffeeLottery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean isHacker = false;
        int sum = 0;

        int[] scores = {100, 100, 200, 200, 300, 300, 400, 400, 500};

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            int n = Integer.parseInt(st.nextToken());

            if (n > score) isHacker = true;

            sum += n;
        }

        bw.write(isHacker ? "hacker" : sum < 100 ? "none" : "draw");

        bw.flush();
        bw.close();
        br.close();
    }
}
