package test2863;

import java.io.*;
import java.util.StringTokenizer;

public class Fraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = 2, count = 0;
        double max = Double.MIN_VALUE;
        int[][] original = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                original[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 4; i++) {
            double fraction = (double) original[0][0] / original[1][0]
                            + (double) original[0][1] / original[1][1];

            if (fraction > max) {
                max = fraction;
                count = i;
            }

            original = rotated(original);
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();

    }

    static int[][] rotated(int[][] original) {
        int n = original.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = original[i][j];
            }
        }

        return rotated;
    }
}
