package test8658;

import java.io.*;

public class Liczba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = 0, max = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                min = i;
                break;
            }
        }

        for (int i = n - 1; i > 2; i--) {
            if (n % i != 0) {
                max = i;
                break;
            }
        }

        bw.write(min + " " + max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
