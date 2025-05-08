package test29267;

import java.io.*;
import java.util.StringTokenizer;

public class GameScenario {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int save = 0, cur = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int caseNo = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            String action = br.readLine();

            if (action.equals("save")) {
                save = cur;
            } else if (action.equals("load")) {
                cur = save;
            } else if (action.equals("ammo")) {
                cur += k;
            } else if (action.equals("shoot")) {
                cur--;
            }

            sb.append(cur + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
