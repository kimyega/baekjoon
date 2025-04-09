package test25625;

import java.io.*;
import java.util.StringTokenizer;

public class ShuttleBus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int res = x > y ? x + y : y - x;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
