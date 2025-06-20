package test11161;

import java.io.*;
import java.util.StringTokenizer;

public class NegativePeopleInDaHouse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseeNo = Integer.parseInt(br.readLine());

        while (caseeNo-- > 0) {
            int house = 0, min = 0;
            int m = Integer.parseInt(br.readLine());

            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                int in = Integer.parseInt(st.nextToken());
                int out = Integer.parseInt(st.nextToken());

                house += in;

                if (house < out) {
                    min += out - house;
                    house = 0;
                } else house -= out;
            }

            sb.append(min).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
