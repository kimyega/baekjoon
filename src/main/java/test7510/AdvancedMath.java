package test7510;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class AdvancedMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Integer> list;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                list.add(n);
            }

            list = list.stream().sorted().collect(Collectors.toList());
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);

            boolean isTrgl = a * a + b * b == c * c;
            sb.append("Scenario #" + i + ":\n").append(isTrgl ? "yes" : "no").append("\n\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
