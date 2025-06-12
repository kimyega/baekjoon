package test25024;

import java.io.*;
import java.util.StringTokenizer;

public class DateTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            sb.append(x <= 23 && y <= 59 ? "Yes " : "No ");

            boolean isDate;

            if (x <= 0 || x > 12) {
                isDate = false;
            } else if (y <= 0 || y > daysInMonth[x - 1]) {
                isDate = false;
            } else {
                isDate = true;
            }


            sb.append(isDate ? "Yes" : "No");
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
