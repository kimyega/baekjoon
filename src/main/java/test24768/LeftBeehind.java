package test24768;

import java.io.*;
import java.util.StringTokenizer;

public class LeftBeehind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            if (x == 0 && y == 0) break;
            else if (x + y == 13) sb.append("Never speak again.");
            else if (x == y) sb.append("Undecided.");
            else if (x < y) sb.append("Left beehind.");
            else sb.append("To the convention.");

            sb.append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
