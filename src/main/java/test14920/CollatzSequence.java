package test14920;

import java.io.*;

public class CollatzSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c1 = Integer.parseInt(br.readLine());

        int res = collatzCalc(c1, 1);

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
    static int collatzCalc(int cn, int n) {
        if (cn == 1) return n;
        return collatzCalc(cn % 2 == 0 ? cn / 2 : 3 * cn + 1, n + 1);
    }
}
