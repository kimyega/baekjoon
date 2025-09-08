package test31613;

import java.io.*;

public class Repetition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        bw.write(calcSteps(x) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int n;
    static int calcSteps(int x) {
        x = x % 3 == 0 ? x + 1 : x % 3 == 1 ? x * 2 : x * 3;
        return x >= n ? 1 : calcSteps(x) + 1;
    }
}
