package test9848;

import java.io.*;
import java.util.StringTokenizer;

public class Gift {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int gift = 0, pt = 0;

        while (n-- > 0) {
            int t = Integer.parseInt(br.readLine());
            if (pt - t >= k) gift++;
            pt = t;
        }

        bw.write(gift + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
