package test4459;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlwaysFollowTheRulesInZombieland {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        List<String> rules = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            rules.add(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String rule = "";
            int ruleNo = Integer.parseInt(br.readLine());
            if (ruleNo <= 0 || ruleNo > rules.size()) rule = "No such rule";
            else rule = rules.get(ruleNo - 1);

            sb.append("Rule ").append(ruleNo).append(": ").append(rule).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
