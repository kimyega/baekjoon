package test32046;

import java.io.*;
import java.util.StringTokenizer;

public class SnacksWithin300Yen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int snacks = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int snack = Integer.parseInt(st.nextToken());
                if (snacks + snack <= 300) snacks += snack;
            }

            sb.append(snacks).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
