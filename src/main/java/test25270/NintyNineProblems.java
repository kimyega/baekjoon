package test25270;

import java.io.*;

public class NintyNineProblems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int ns = n / 100;

        String minnStr = (ns == 0 ? ns : ns - 1) + "99";
        String maxnStr = ns + "99";

        int min = Integer.parseInt(minnStr);
        int max = Integer.parseInt(maxnStr);

        int minDiff = Math.abs(min - n);
        int maxDiff = Math.abs(max - n);

        String res = (minDiff < maxDiff ? min : max) + "";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
