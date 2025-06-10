package test25286;

import java.io.*;
import java.util.StringTokenizer;

public class NovemberEleventh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int year = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(dateCalc(year, m)).append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static String dateCalc(int year, int m) {
        int month = m - 1, day = 0;
        if (month == 0) {
            year--;
            month = 12;
        }

        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                day = 29;
            } else {
                day = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        } else {
            day = 31;
        }
        return year + " " + month + " " + day;
    }
}
