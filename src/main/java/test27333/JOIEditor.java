package test27333;

import java.io.*;

public class JOIEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        char preC = s.charAt(0);
        sb.append(preC);

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            sb.append(c);
            if (c == preC) {
                sb.delete(sb.length() - 2, sb.length());
                sb.append((c + "").repeat(2).toUpperCase());
            }
            preC = sb.charAt(sb.length() - 1);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
