package test15354;

import java.io.*;

public class Aron {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        char prev = '0';

        while (n-- > 0) {
            char pres = br.readLine().charAt(0);

            if (pres != prev) cnt++;
            prev = pres;
        }

        bw.write(++cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
