package test16018;

import java.io.*;

public class OccupyParking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[] yd = br.readLine().toCharArray();
        char[] td = br.readLine().toCharArray();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (yd[i] == 'C' && td[i] == 'C') cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
