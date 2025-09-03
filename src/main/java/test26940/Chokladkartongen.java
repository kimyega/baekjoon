package test26940;

import java.io.*;
import java.util.StringTokenizer;

public class Chokladkartongen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int pre = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while (st.hasMoreTokens()) {
            int curr = Integer.parseInt(st.nextToken());
            if (curr > pre) cnt++;
            pre = curr;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
