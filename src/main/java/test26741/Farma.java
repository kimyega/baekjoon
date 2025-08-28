package test26741;

import java.io.*;
import java.util.StringTokenizer;

public class Farma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int chicken = 2 * x - y / 2;
        int cow = y / 2 - x;

        bw.write(chicken + " " + cow + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
