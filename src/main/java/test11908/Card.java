package test11908;

import java.io.*;
import java.util.StringTokenizer;

public class Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0, sum = 0;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int cn = Integer.parseInt(st.nextToken());

            max = Math.max(max, cn);
            sum += cn;
        }

        bw.write(sum - max + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
