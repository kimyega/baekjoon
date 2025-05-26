package test14264;

import java.io.*;

public class HexagonAndTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());

        double res = Math.sqrt(3) / 4 * l * l;
        bw.write(String.valueOf(res));

        bw.flush();
        bw.close();
        br.close();
    }
}
