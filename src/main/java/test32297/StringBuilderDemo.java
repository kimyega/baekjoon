package test32297;

import java.io.*;

public class StringBuilderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        bw.write(s.contains("gori") ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
