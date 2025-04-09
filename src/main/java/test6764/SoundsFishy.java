package test6764;

import java.io.*;

public class SoundsFishy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int prev = 0;
        boolean isRising = true, isDiving = true, isConstant = true;

        for (int i = 0; i < 4; i++) {
            int n = Integer.parseInt(br.readLine());

            if (i == 0) {
                prev = n;
                continue;
            }

            if (prev < n) {
                isDiving = false;
                isConstant = false;
            } else if (prev > n) {
                isRising = false;
                isConstant = false;
            } else {
                isRising = false;
                isDiving = false;
            }

            prev = n;
        }

        if (isRising) {
            bw.write("Fish Rising");
        } else if (isDiving) {
            bw.write("Fish Diving");
        } else if (isConstant) {
            bw.write("Fish At Constant Depth");
        } else {
            bw.write("No Fish");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
