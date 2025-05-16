package test10984;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class GradeCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringJoiner sj = new StringJoiner("\n");
        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            int totalGrade = 0;
            double multiSum = 0, gSum = 0, gpa = 0;
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                double g = Double.parseDouble(st.nextToken());

                totalGrade += c;
                multiSum += c * g;
                gSum += g;
            }

            gpa = multiSum / totalGrade;

            sj.add(String.format("%d %.1f", totalGrade, gpa));
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
