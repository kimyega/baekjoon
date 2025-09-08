package test30314;

import java.io.*;

public class JustAJoystick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String score = br.readLine();
        String initial = br.readLine();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char curr = score.charAt(i);
            char target = initial.charAt(i);

            cnt += joystick(curr, target);
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static int joystick(char curr, char target) {
        return Math.min(Math.abs(curr - target), 26 - Math.abs(curr - target));
    }
}
