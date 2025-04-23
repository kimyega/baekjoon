package test24860;

import java.io.*;
import java.util.StringTokenizer;

public class CountingAntibodies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long sum = 0;


        for (int i = 0; i < 3; i++) {
            long k = 1;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = st.countTokens();

            while (st.hasMoreTokens()) {
                long n = Long.parseLong(st.nextToken());
                k *= n;
            }

            if (count < 3) {
                sum += k;
            } else {
                sum *= k;
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
