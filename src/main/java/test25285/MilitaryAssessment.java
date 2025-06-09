package test25285;

import java.io.*;
import java.util.StringTokenizer;

public class MilitaryAssessment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            double dh = h / 100.0;
            double bmi = (w / (dh * dh) * 10.0) / 10.0;

            if (h <= 140) {
                sb.append(6);
            } else if (h < 146) {
                sb.append(5);
            } else if (h < 159) {
                sb.append(4);
            } else if (h < 161) {
                if (bmi >= 16.0 && bmi < 35.0) {
                    sb.append(3);
                } else {
                    sb.append(4);
                }
            } else if (h < 204) {
                if (bmi >= 20.0 && bmi < 25.0) {
                    sb.append(1);
                } else if (bmi >= 18.5 && bmi < 20.0 || bmi >= 25.0 && bmi < 30.0) {
                    sb.append(2);
                } else if (bmi >= 16.0 && bmi < 18.5 || bmi >= 30.0 && bmi < 35.0) {
                    sb.append(3);
                } else {
                    sb.append(4);
                }
            } else {
                sb.append(4);
            }

            sb.append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
