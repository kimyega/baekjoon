package test1267;

import java.io.*;
import java.util.StringTokenizer;

public class CallCharge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int yongsik = 0, minsik = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int t = Integer.parseInt(st.nextToken());

            yongsik += (t / 30 + 1) * 10;
            minsik += (t / 60 + 1) * 15;
        }

        String charge = yongsik == minsik ? "Y M " + yongsik : yongsik < minsik ? "Y " + yongsik: "M " + minsik;
        bw.write(charge);

        bw.flush();
        bw.close();
        br.close();
    }
}
