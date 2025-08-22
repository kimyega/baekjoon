package test13617;

import java.io.*;
import java.util.StringTokenizer;

public class Handebol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while (n-- > 0) {
            boolean isGoal = true;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                if (st.nextToken().equals("0")) {
                    isGoal = false;
                    break;
                }
            }

            cnt += isGoal ? 1 : 0;
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
