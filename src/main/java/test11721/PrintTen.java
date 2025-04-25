package test11721;

import java.io.*;

public class PrintTen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String line = "";

        while ((line = br.readLine()) != null) {
            int len = line.length();
            boolean flag = len % 10 == 0;
            int lineNo = flag ? len / 10 : len / 10 + 1;

            for (int i = 0; i < lineNo; i++) {
                if (!flag && i == lineNo - 1) {
                    sb.append(line.substring(i * 10));
                } else {
                    sb.append(line.substring(i * 10, (i + 1) * 10));
                }
                sb.append("\n");
            }

            sb.deleteCharAt(sb.length() - 1);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
