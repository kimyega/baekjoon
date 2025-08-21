package test13063;

import java.io.*;
import java.util.StringTokenizer;

public class Lobby {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0 && k == 0) break;

            int majority = n / 2 + 1;
            int indep = n - m - k;
            int need = majority - m;
            int req;

            if (need <= 0) req = 0;
            else if (need > indep) req = -1;
            else req = need;

            sb.append(req).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
