package test6780;

import java.io.*;

public class SumacSequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());

        bw.write(seqLength(t1, t2) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int seqLength (int t1, int t2) {
        int t3 = t1 - t2;
        if (t1 < t2) return 2;
        return 1 + seqLength(t2, t3);
    }
}
