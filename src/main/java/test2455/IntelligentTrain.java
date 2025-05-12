package test2455;

import java.io.*;
import java.util.StringTokenizer;

public class IntelligentTrain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int bus = 0, max = 0;
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int off = Integer.parseInt(st.nextToken());
            int on  = Integer.parseInt(st.nextToken());

            if (on == 0) break;

            bus += on - off;
            max = Math.max(max, bus);
        }

        bw.write(max + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
