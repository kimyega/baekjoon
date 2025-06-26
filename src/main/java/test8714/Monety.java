package test8714;

import java.io.*;
import java.util.StringTokenizer;

public class Monety {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int front = 0, back = 0;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int coin = st.nextToken().charAt(0) - '0';
            if (coin == 0) front ++;
            else back ++;
        }

        bw.write(Math.min(front, back) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
