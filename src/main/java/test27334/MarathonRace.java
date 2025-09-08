package test27334;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarathonRace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (!rankMap.containsKey(sorted[i])) {
                rankMap.put(sorted[i], i + 1);
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(rankMap.get(arr[i])).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
