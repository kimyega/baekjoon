package test15917;

import java.io.*;

public class NoSolPreventer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int a = Integer.parseInt(br.readLine());

            String bs = Integer.toBinaryString(a);
            long count = bs.chars().filter(c -> c == '1').count();

            sb.append(count == 1 ? 1 : 0).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
