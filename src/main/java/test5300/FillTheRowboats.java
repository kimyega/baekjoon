package test5300;

import java.io.*;

public class FillTheRowboats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write(i + 1 + " ");
            if ((i + 1) % 6 == 0) {
                bw.write("Go! ");
            } else if (i + 1 == n) {
                bw.write("Go!");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
