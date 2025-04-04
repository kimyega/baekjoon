package test11948;

import java.io.*;

public class SelectSubject {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] science = new int[4];
        int scSum = 0;
        for (int i = 0; i < 4; i++) {
            science[i] = Integer.parseInt(br.readLine());
        }
        int scMin = science[0];
        for (int score : science) {
            scMin = Math.min(score, scMin);
            scSum += score;
        }
        int hi1 = Integer.parseInt(br.readLine());
        int hi2 = Integer.parseInt(br.readLine());
        int hiSum = hi1 + hi2;
        int hiMin = Math.min(hi1, hi2);
        int result = scSum - scMin + hiSum - hiMin;
        bw.write(result + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
