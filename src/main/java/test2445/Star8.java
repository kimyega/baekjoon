package test2445;

import java.io.*;

public class Star8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String st = "*";
        String bl = " ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n * 2 - 1; i++) {
            if (i < n) {
                sb.append(st.repeat(i + 1));
                sb.append(bl.repeat((n - i - 1) * 2));
                sb.append(st.repeat(i + 1));
            } else {
                sb.append(st.repeat(n * 2 - i - 1));
                sb.append(bl.repeat((i - n + 1) * 2));
                sb.append(st.repeat(n * 2 - i - 1));
            }

            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
