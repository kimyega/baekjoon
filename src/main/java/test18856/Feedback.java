package test18856;

import java.io.*;

public class Feedback {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(n).append("\n");

        for (int i = 1; ; i++) {
            if (i <= n - 1) sb.append(i).append(" ");
            else if (isPrime(i)) {
                sb.append(i);
                break;
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
