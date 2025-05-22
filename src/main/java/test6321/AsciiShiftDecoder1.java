package test6321;

import java.io.*;

public class AsciiShiftDecoder1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            String s = br.readLine();
            sb.append("String #" + i + "\n");

            for (char c : s.toCharArray()) {
                char next = c == 'Z' ? 'A' : (char) (c + 1);
                sb.append(next);
            }
            sb.append("\n\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
