package test30658;

import java.io.*;

public class ReverseRanking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int caseNo = Integer.parseInt(br.readLine());
            if (caseNo == 0) break;

            int[] arr = new int[caseNo];

            for (int i = 0; i < caseNo; i++) {
                arr[caseNo - i - 1] = Integer.parseInt(br.readLine());
            }

            for (int num : arr) {
                sb.append(num + "\n");
            }
            sb.append("0\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
