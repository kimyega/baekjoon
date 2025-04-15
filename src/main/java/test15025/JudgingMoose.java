package test15025;

import java.io.*;
import java.util.StringTokenizer;

public class JudgingMoose {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == 0 && b == 0) {
            bw.write("Not a moose");
        } else if (a != b) {
            bw.write("Odd " + Math.max(a, b) * 2);
        } else {
            bw.write("Even " + a * 2);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
