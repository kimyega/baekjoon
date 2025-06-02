package test10205;

import java.io.*;

public class HeraclesAndHydra {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            int h = Integer.parseInt(br.readLine());
            String s = br.readLine();

            for (char c : s.toCharArray()) {
                if (c == 'c') h++;
                else h--;
            }

            sb.append("Data Set " + i + ":\n").append(h).append("\n\n");
        }

        sb.delete(sb.length() - 1, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
