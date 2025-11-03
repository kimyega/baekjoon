package test4118;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FredsLottoTickets {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        Set<Integer> set;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int caseNo = Integer.parseInt(br.readLine());
            if (caseNo == 0) break;

            set = new HashSet<Integer>();

            while (caseNo-- > 0) {
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    set.add(Integer.parseInt(st.nextToken()));
                }
            }

            sb.append(set.size() == 49 ? "Yes" : "No").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
