package test10409;

import java.io.*;
import java.util.StringTokenizer;

public class Server {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int reqSum = 0, task = 0;

        while (st.hasMoreTokens()) {
            int req = Integer.parseInt(st.nextToken());

            reqSum += req;
            if (reqSum > time) continue;

            task++;
        }

        bw.write(task + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
