package test14913;

import java.io.*;
import java.util.StringTokenizer;

public class ArithmeticSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int n = 1;
        int asq;
        String res = "X";

        while (true) {

            asq = a + (n - 1) * d;

            if ((d > 0 && asq > k) || (d < 0 && asq < k)) break;

            if (asq == k) {
                res = n + "";
                break;
            }

            n++;
        }

        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
