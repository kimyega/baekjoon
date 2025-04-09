package test18411;

import java.io.*;
import java.util.StringTokenizer;

public class Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0, min = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            sum += n;
            min = Math.min(min, n);
        }

        int res = sum - min;
        bw.write("" + res);

        bw.flush();
        bw.close();
        br.close();
    }
}
