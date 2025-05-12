package test10162;

import java.io.*;

public class Microwave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] micro = {300, 60, 10};

        int time = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int m : micro) {
            sb.append(time / m).append(" ");
            time %= m;
        }

        bw.write(time != 0 ? "-1" : sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}
