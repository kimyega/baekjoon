package test9622;

import java.io.*;
import java.util.StringTokenizer;

public class CabinBaggage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int res = 0;

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            double length = Double.parseDouble(st.nextToken());
            double width = Double.parseDouble(st.nextToken());
            double height = Double.parseDouble(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            int count = isAllowed(length, width, height, weight) ? 1 : 0;
            res += count;
            sb.append(count).append("\n");
        }

        bw.write(sb.toString() + res);

        bw.flush();
        bw.close();
        br.close();
    }
    static boolean isAllowed (double length, double width, double height, double weight) {
        return (length <= 56 && width <= 45 && height <= 25 || (length + width + height) <= 125) && weight <= 7;
    }
}
