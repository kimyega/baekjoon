package test10991;

import java.io.*;

public class Star16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String stbl = "* ";
        String bl = " ";

        for (int i = 0; i < n; i++) {
            sb.append(bl.repeat(n - i - 1));
            sb.append(stbl.repeat(i + 1).trim());
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
