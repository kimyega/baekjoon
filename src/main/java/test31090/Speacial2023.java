package test31090;

import java.io.*;

public class Speacial2023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseNo; i++) {
            int n = Integer.parseInt(br.readLine());
            int tgn = n % 100;

            if ((n + 1) % tgn == 0) {
                sb.append("Good");
            } else {
                sb.append("Bye");
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
