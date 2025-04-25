package test2441;

import java.io.*;

public class Star4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String st = "*";
        String bl = " ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(bl.repeat(i));
            sb.append(st.repeat(n - i));
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
