package test2460;

import java.io.*;
import java.util.StringTokenizer;

public class SmartTrain2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.MIN_VALUE, train = 0, station = 10;
        StringTokenizer st;

        while (station-- > 0) {
            st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            train += in - out;
            max = Math.max(max, train);
        }

        bw.write(max + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
