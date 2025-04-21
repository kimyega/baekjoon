package test6888;

import java.io.*;

public class TermsOfOffice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sYear = Integer.parseInt(br.readLine());
        int eYear = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = sYear; i <= eYear; i++) {
            if ((i - sYear) % 60 == 0) {
                sb.append("All positions change in year " + i + "\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
