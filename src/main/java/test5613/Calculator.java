package test5613;

import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        while (true) {
            String s = br.readLine();
            if (s.equals("=")) break;

            int b = Integer.parseInt(br.readLine());

            if (s.equals("+")) a += b;
            else if (s.equals("-")) a -= b;
            else if (s.equals("*")) a *= b;
            else if (s.equals("/")) a /= b;
        }

        bw.write(a + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
