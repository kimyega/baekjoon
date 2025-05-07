package test32306;

import java.io.*;
import java.util.StringTokenizer;

public class BasketballScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int aScore = 0, bScore = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= 3; i++) {
            aScore += Integer.parseInt(st.nextToken()) * i;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 3; i++) {
            bScore += Integer.parseInt(st.nextToken()) * i;
        }

        String res = aScore == bScore ? "0" : aScore > bScore ? "1" : "2";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
