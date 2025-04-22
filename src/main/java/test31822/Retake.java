package test31822;

import java.io.*;

public class Retake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String subject = br.readLine();
        int caseNo = Integer.parseInt(br.readLine());
        String sjCode = subject.substring(0, 5);

        int count = 0;
        for (int i = 0; i < caseNo; i++) {
            String line = br.readLine();
            String code = line.substring(0, 5);

            if (sjCode.equals(code)) {
                count++;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
