package test8558;

import java.io.*;

public class Silnia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        String s = sum + "";
        bw.write(s.charAt(s.length() - 1));

        bw.newLine();
        bw.flush();
        bw.close();
    }
}
