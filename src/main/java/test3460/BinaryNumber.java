package test3460;

import java.io.*;

public class BinaryNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int idx = 0;
            int n = Integer.parseInt(br.readLine());

            String binary = Integer.toBinaryString(n);
            binary = new StringBuilder(binary).reverse().toString();

            for (char ch : binary.toCharArray()) {

                if (ch == '1') {
                    sb.append(idx + " ");
                }
                idx++;
            }
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}
