package test6491;

import java.io.*;
import java.util.StringTokenizer;

public class Perfection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String line = "";

        outer:
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line, " ");

            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                if (n == 0) break outer;

                int sum = sumOfDivisors(n);
                String res = sum == n ? "PERFECT" : sum < n ? "DEFICIENT" : "ABUNDANT";

                sb.append(n + " " + res + "\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static int sumOfDivisors (int n) {
        if (n == 1) return 0;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }
}
