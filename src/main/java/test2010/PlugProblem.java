package test2010;

import java.io.*;

public class PlugProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int multi = Integer.parseInt(br.readLine());

            sum += multi - 1;
        }

        sum++;
        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
