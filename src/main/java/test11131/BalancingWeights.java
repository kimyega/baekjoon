package test11131;

import java.io.*;
import java.util.StringTokenizer;

public class BalancingWeights {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            int totTorque = 0;
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                totTorque += Integer.parseInt(st.nextToken());
            }

            sb.append(totTorque == 0 ? "Equilibrium" : totTorque > 0 ? "Right": "Left");
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
