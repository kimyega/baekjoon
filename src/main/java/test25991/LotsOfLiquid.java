package test25991;

import java.io.*;
import java.util.StringTokenizer;

public class LotsOfLiquid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double liq = 0;

        while (st.hasMoreTokens()) {
            double num =  Double.parseDouble(st.nextToken());
            liq += Math.pow(num, 3);
        }

        double result = Math.cbrt(liq);
        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
