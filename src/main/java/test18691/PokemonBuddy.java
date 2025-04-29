package test18691;

import java.io.*;
import java.util.StringTokenizer;

public class PokemonBuddy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] group = {1, 3, 5};
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int groupNo = Integer.parseInt(st.nextToken());
            int currentCandy = Integer.parseInt(st.nextToken());
            int targetCandy = Integer.parseInt(st.nextToken());

            int kmPerCandy = group[groupNo - 1];
            int candiesNeeded = targetCandy - currentCandy;
            int reqKm = candiesNeeded <= 0 ? 0 : candiesNeeded * kmPerCandy;

            sb.append(reqKm + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
