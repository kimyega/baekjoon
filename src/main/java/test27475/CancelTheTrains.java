package test27475;

import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CancelTheTrains {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Set<Integer> trains = Arrays.stream(br.readLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());

            int cnt = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int y = Integer.parseInt(st.nextToken());
                if (trains.contains(y)) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
