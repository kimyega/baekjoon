package test10039;

import java.io.*;

public class Average {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            if (score < 40) score = 40;
            sum += score;
        }
        bw.write((sum / 5) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
