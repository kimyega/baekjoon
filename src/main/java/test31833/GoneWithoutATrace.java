package test31833;

import java.io.*;
import java.util.StringTokenizer;

public class GoneWithoutATrace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        long min = Long.MAX_VALUE;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            String str = "";

            while (st.hasMoreTokens()) {
                str += st.nextToken();
            }

            long num = Long.parseLong(str);
            min = Math.min(min, num);
        }

        bw.write(min + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
