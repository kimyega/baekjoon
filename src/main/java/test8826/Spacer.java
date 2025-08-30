package test8826;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Spacer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            Map<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            int NCnt = map.getOrDefault('N', 0);
            int SCnt = map.getOrDefault('S', 0);
            int Ecnt = map.getOrDefault('E', 0);
            int WCnt = map.getOrDefault('W', 0);

            int timeToHome = Math.abs(SCnt - NCnt) + Math.abs(Ecnt - WCnt);
            sb.append(timeToHome).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
