package test24196;

import java.io.*;

public class HiddenWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        StringBuilder sb = new StringBuilder();

        int start = 0;
        while (true) {

            int endIdx = line.length() - 1;
            char c = line.charAt(start);

            if (start == 0) {
                sb.append(c);
            }

            start = start + c - 'A' + 1;

            if (start >= endIdx) {
                sb.append(line.charAt(endIdx));
                break;
            }
            char ch = line.charAt(start);
            sb.append(ch);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
