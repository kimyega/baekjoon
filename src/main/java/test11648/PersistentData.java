package test11648;

import java.io.*;

public class PersistentData {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(countStep(n) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int countStep(int n) {
        if (n < 10) return 0;

        int next = 1;
        while (n > 0) {
            next *= n % 10;
            n /= 10;
        }

        return 1 + countStep(next);
    }
}
