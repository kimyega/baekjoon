package test1284;

import java.io.*;

public class HomeAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int margin = 1;
            String s = br.readLine();

            if (s.equals("0")) break;

            for (char c : s.toCharArray()) {
                int n = c - '0';

                margin += n == 1 ? 2 : n == 0 ? 4 : 3;
                margin++;
            }

            sb.append(margin).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
