package test21339;

import java.io.*;
import java.util.StringTokenizer;

public class ContestStruggles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int unsolved = n - k;
        int unsolvedSum = d * n - k * s;
        double unsolvedAvg = (double) unsolvedSum / unsolved;
        String res = unsolvedAvg > 100 || unsolvedAvg < 0 ? "impossible" : unsolvedAvg + "";

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
