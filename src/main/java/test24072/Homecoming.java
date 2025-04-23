package test24072;

import java.io.*;
import java.util.StringTokenizer;

public class Homecoming {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int isHc = c >= a && c < b ? 1 : 0;
        bw.write(isHc + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
