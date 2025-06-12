package test29720;

import java.io.*;
import java.util.StringTokenizer;

public class UserProblemStats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int min = Math.max(0, n - m * k);

        int max = n - 1 - m * (k - 1);
        if (max < 0) max = 0;

        bw.write(min + " " + max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
