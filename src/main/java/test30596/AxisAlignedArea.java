package test30596;

import java.io.*;
import java.util.Arrays;

public class AxisAlignedArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] lengths = new int[4];
        for (int i = 0; i < 4; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lengths);
        int res = lengths[0] * lengths[2];
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();

    }
}
