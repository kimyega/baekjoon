package test26532;

import java.io.*;
import java.util.StringTokenizer;

public class Acres {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int y = 5 * 4840;
        int c = w * h % y == 0 ? w * h / y : w * h / y + 1;
        bw.write(c + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
