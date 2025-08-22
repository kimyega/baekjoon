package test9924;

import java.io.*;
import java.util.StringTokenizer;

public class TheEuclideanAlgorithm {

    static int euclid (int a, int b) {
        return a == b ? 0 : euclid(Math.abs(a - b), Math.min(a, b)) + 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(euclid(a, b) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
