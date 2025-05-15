package test9610;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Quadrant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int caseNo = Integer.parseInt(br.readLine());

        Map<String, Integer> qdnts = new HashMap<>();
        qdnts.put("AXIS", 0);
        qdnts.put("Q1", 0);
        qdnts.put("Q2", 0);
        qdnts.put("Q3", 0);
        qdnts.put("Q4", 0);

        while (caseNo-- > 0) {
            String qdntStr = "";

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                qdntStr = "AXIS";
            } else if (x > 0 && y > 0) {
                qdntStr = "Q1";
            } else if (x < 0 && y > 0) {
                qdntStr = "Q2";
            } else if (x < 0) {
                qdntStr = "Q3";
            } else {
                qdntStr = "Q4";
            }

            qdnts.put(qdntStr, qdnts.get(qdntStr) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : qdnts.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
