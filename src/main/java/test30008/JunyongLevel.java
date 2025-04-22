package test30008;

import java.io.*;
import java.util.StringTokenizer;

public class JunyongLevel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int p = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        while (st1.hasMoreTokens()) {
            int g = Integer.parseInt(st1.nextToken());
            p = g * 100 / n;
            sb.append(grade(p) + " ");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static int grade(int p) {
        int grade = 0;

        if (p <= 4) {
            grade = 1;
        } else if (p <= 11) {
            grade = 2;
        } else if (p <= 23) {
            grade = 3;
        } else if (p <= 40) {
            grade = 4;
        } else if (p <= 60) {
            grade = 5;
        } else if (p <= 77) {
            grade = 6;
        } else if (p <= 89) {
            grade = 7;
        } else if (p <= 96) {
            grade = 8;
        } else if (p <= 100) {
            grade = 9;
        }

        return grade;
    }
}
