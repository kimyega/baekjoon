package test25600;

import java.io.*;
import java.util.StringTokenizer;

public class Triathlon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int max= 0;


        for (int i = 0; i < caseNo; i++) {
            int score = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            score = a * (d + g);
            if (a == d + g) {
                score *= 2;
            }

            max = Math.max(max, score);
        }

        bw.write(max + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
