package test28288;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialEvent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int days = 5;

        int[] attend = new int[days];

        br.lines().limit(n).forEach(line -> {
            for (int i = 0; i < days; i++) {
                if (line.charAt(i) == 'Y') attend[i]++;
            }
        });

        int max = Arrays.stream(attend).max().getAsInt();

        String result = IntStream.range(0, days)
                .filter(i -> attend[i] == max)
                .mapToObj(i -> String.valueOf(i + 1))
                .collect(Collectors.joining(","));

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
