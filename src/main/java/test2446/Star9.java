package test2446;

import java.io.*;

public class Star9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String st = "*";
        String bl = " ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n * 2 - 1; i++) {
            if (i < n) {
                sb.append(bl.repeat(i));
                sb.append(st.repeat((n - i) * 2 - 1));
            } else {
                sb.append(bl.repeat(n * 2  - i - 2));
                sb.append(st.repeat((i - n + 2) * 2 - 1));
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
