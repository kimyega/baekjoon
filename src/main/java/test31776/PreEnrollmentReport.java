package test31776;

import java.io.*;
import java.util.StringTokenizer;

public class PreEnrollmentReport {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = 0;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String line = br.readLine();
            if (line.equals("-1 -1 -1")) continue;

            st = new StringTokenizer(line);
            int pre = Integer.parseInt(st.nextToken());
            boolean isOut = false;

            while (st.hasMoreTokens()) {
                int t = Integer.parseInt(st.nextToken());
                isOut |= t >= 0 && (pre < 0 || t < pre);
                pre = t;
            }

            if (!isOut) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
