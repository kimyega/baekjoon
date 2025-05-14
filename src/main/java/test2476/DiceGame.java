package test2476;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DiceGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxPrize = 0;
        StringTokenizer st;
        Map<Integer, Integer> map;
        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            int prize = 0, sameNum = 0, max = 0;
            map = new HashMap<>();

            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());

                map.put(num, map.getOrDefault(num, 0) + 1);
                max = Math.max(max, num);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                int num = entry.getKey();

                if (value > 1) {
                    sameNum = num;
                }
            }

            if (map.size() == 1) {
                prize = 10000 + sameNum * 1000;
            } else if (map.size() == 2) {
                prize = 1000 + sameNum * 100;
            } else {
                prize = max * 100;
            }

            maxPrize = Math.max(maxPrize, prize);
        }

        bw.write(maxPrize + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
