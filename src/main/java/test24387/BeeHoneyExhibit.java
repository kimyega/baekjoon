package test24387;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BeeHoneyExhibit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 3;

        int[] price = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] weight = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(price);
        Arrays.sort(weight);

        long maxProfit = IntStream.range(0, 3)
                .mapToLong(i -> (long) price[i] * weight[i])
                .sum();

        bw.write(maxProfit + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
