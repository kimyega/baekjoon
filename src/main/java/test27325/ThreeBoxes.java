package test27325;

import java.io.*;

public class ThreeBoxes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0, ball = 1;

        for (char c : s.toCharArray()) {
            if (c == 'L' && ball != 1) ball -= 1;
            else if (c == 'R' && ball != 3) ball += 1;
            if (ball == 3) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
