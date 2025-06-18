package test7581;

import java.io.*;
import java.util.StringTokenizer;

public class Cuboids {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if (l == 0 && w == 0 && h == 0 && v == 0) break;

            if (l == 0) l = v / (w * h);
            else if (w == 0) w = v / (l * h);
            else if (h == 0) h = v / (l * w);
            else v = l * w * h;

            sb.append(l + " " + w + " " + h + " " + v + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
