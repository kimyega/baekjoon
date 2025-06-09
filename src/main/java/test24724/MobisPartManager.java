package test24724;

import java.io.*;
import java.util.StringTokenizer;

public class MobisPartManager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int sizeLimit = Integer.parseInt(st.nextToken());
            int weightLimit = Integer.parseInt(st.nextToken());

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                int size = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());
            }

            sb.append("Material Management " + i + "\nClassification ---- End!\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
