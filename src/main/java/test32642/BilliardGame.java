package test32642;

import java.io.*;
import java.util.StringTokenizer;

public class BilliardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long angry = 0, sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            if (s.equals("1")) {
                angry++;
            } else {
                angry--;
            }

            sum += angry;
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
