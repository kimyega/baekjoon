package test13623;

import java.io.*;
import java.util.StringTokenizer;

public class ZeroOrOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] c = {'A', 'B', 'C', '*'};

        StringBuilder sb = new StringBuilder();

        int oneCount = 0, zeroCount = 0;
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 1) {
                oneCount++;
            } else {
                zeroCount++;
            }
            sb.append(n + "");
        }

        String s = sb.toString();
        if (oneCount == 3 || zeroCount == 3) {
            bw.write(c[3] + "");
        } else {
            String nStr = oneCount > zeroCount ? "0" : "1";
            bw.write(c[s.indexOf(nStr)] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
