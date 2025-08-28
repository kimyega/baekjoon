package test27330;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Score {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Integer> scores = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int m = Integer.parseInt(br.readLine());
        Set<Integer> zeroScores = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        int result = scores.stream()
                .reduce(0, (acc, score) -> {
                    int newScore = acc + score;
                    return zeroScores.contains(newScore) ? 0 : newScore;
                });

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
