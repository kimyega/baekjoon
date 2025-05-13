package test2953;

import java.io.*;
import java.util.StringTokenizer;

public class IAmChef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0, no = 0;
        StringTokenizer st;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            if (sum > max) {
                max = sum;
                no = i;
            }
        }

        bw.write(no + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}
