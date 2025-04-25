package test10992;

import java.io.*;

public class Star17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String st = "*";
        String bl = " ";

        for (int i = 0; i < n; i++) {
            sb.append(bl.repeat(n - 1 - i));

            if (i == 0 || i == n - 1) {
                sb.append(st.repeat(i * 2 + 1));
                sb.append("\n");
                continue;
            }

            sb.append(st);
            sb.append(bl.repeat(i * 2 - 1));
            sb.append(st);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
