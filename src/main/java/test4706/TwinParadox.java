package test4706;

import java.io.*;
import java.util.StringTokenizer;

public class TwinParadox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            double ta = Double.parseDouble(st.nextToken());
            double tb = Double.parseDouble(st.nextToken());
            if (ta == 0 && tb == 0) break;

            double y = tb / ta;
            double v = Math.sqrt(1 - y * y);

            sb.append(String.format("%.3f\n", v));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
