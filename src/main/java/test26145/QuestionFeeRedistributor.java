package test26145;

import java.io.*;
import java.util.StringTokenizer;

public class QuestionFeeRedistributor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] staffs = new int[n + m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            staffs[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n + m; j++) {
                int money = Integer.parseInt(st.nextToken());
                staffs[i] -= money;
                staffs[j] += money;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int staff : staffs) {
            sb.append(staff).append(" ");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}
