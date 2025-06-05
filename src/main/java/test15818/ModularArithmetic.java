package test15818;

import java.io.*;
import java.util.StringTokenizer;

public class ModularArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        long sum = 1;

        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            long a = Long.parseLong(st.nextToken());

            sum *= a % m;
            sum %= m;
        }

        bw.write(sum % m + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
