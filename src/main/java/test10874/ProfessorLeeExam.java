package test10874;

import java.io.*;
import java.util.StringTokenizer;

public class ProfessorLeeExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            boolean isNotTarget = false;
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 10; j++) {
                int n = Integer.parseInt(st.nextToken());

                if ((j - 1) % 5 + 1 != n) {
                    isNotTarget = true;
                    break;
                }
            }

            if (!isNotTarget) sb.append(i).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
