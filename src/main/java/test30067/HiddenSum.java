package test30067;

import java.io.*;

public class HiddenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0, caseNo = 10;

        while (caseNo-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }

        int res = sum / 2;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
