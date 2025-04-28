package test25881;

import java.io.*;
import java.util.StringTokenizer;

public class ElectricBill {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fcs = Integer.parseInt(st.nextToken());
        int cs = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int kwh = Integer.parseInt(br.readLine());
            int cost = kwh > 1000 ? fcs * 1000 + cs * (kwh - 1000) : fcs * kwh;

            sb.append(kwh + " " + cost + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
