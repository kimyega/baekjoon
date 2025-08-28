package test25527;

import java.io.*;
import java.util.StringTokenizer;

public class CountingPeaksOfInfection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();

        while (true) {
            int peak = 0;

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int preV = Integer.parseInt(st.nextToken());
            int currV = Integer.parseInt(st.nextToken());

            while (st.hasMoreTokens()) {
                int postV = Integer.parseInt(st.nextToken());
                if (currV > preV && currV > postV) peak++;
                preV = currV;
                currV = postV;
            }

            sb.append(peak).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
