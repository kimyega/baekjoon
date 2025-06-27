package test9317;

import java.io.*;
import java.util.StringTokenizer;

public class MonitorDPI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());
            int rh = Integer.parseInt(st.nextToken());
            int rv = Integer.parseInt(st.nextToken());
            if (d == 0 && rh == 0 && rv == 0) break;

            double w = 16 * d / Math.sqrt(337);
            double h = 9 * d / Math.sqrt(337);

            double dh = rh / w;
            double dv = rv / h;

            sb.append(String.format("Horizontal DPI: %.2f\n", dh));
            sb.append(String.format("Vertical DPI: %.2f\n", dv));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
