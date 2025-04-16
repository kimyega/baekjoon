package test21591;

import java.io.*;
import java.util.StringTokenizer;

public class LaptopSticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lapWd = Integer.parseInt(st.nextToken());
        int lapHgt = Integer.parseInt(st.nextToken());
        int stickWd = Integer.parseInt(st.nextToken());
        int stickHgt = Integer.parseInt(st.nextToken());

        int res = (lapWd >= stickWd + 2 && lapHgt >= stickHgt + 2) ? 1 : 0;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
