package test9950;

import java.io.*;
import java.util.StringTokenizer;

public class Rectangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            if (l == 0 && w == 0 && a == 0) break;

            if (l == 0) l = a / w;
            else if (w == 0) w = a / l;
            else if (a == 0) a = l * w;

            sb.append(l + " " + w + " " + a + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
