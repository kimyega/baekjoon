package test32902;

import java.io.*;
import java.util.StringTokenizer;

public class Chips {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int max = k * n + 1;
        int min = n + 1;

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}
