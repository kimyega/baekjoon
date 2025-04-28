package test32710;

import java.io.*;

public class Gugudan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean isGugudan = false;

        for (int i = 2; i <= 9; i++) {
            if (n % i == 0 && n / i < 10 || n == 1) {
                isGugudan = true;
            }
        }

        if (isGugudan) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
