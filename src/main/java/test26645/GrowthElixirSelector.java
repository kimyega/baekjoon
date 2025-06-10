package test26645;

import java.io.*;

public class GrowthElixirSelector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int level = Integer.parseInt(br.readLine());

        int[] gb = new int[4];

        if (level >= 200 && level <= 209) {
            gb[0] = Math.min(level + 8, 209);
        }
        if (level >= 200 && level <= 219) {
            gb[1] = Math.min(level + 4, 219);
        }
        if (level >= 200 && level <= 229) {
            gb[2] = Math.min(level + 2, 229);
        }
        gb[3] = level + 1;


        int max = 0, res = 0;

        for (int i = 0; i < gb.length; i++) {
            if (gb[i] > max) {
                max = gb[i];
                res = i + 1;
            }
        }

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
