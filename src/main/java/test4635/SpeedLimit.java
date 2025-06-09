package test4635;

import java.io.*;
import java.util.StringTokenizer;

public class SpeedLimit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int preTime = 0, res = 0;
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                int speed = Integer.parseInt(st.nextToken());
                int elapsedTime = Integer.parseInt(st.nextToken());

                int time = elapsedTime - preTime;
                int distance = time * speed;
                res += distance;
                preTime = elapsedTime;
            }

            sb.append(res + " miles\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
