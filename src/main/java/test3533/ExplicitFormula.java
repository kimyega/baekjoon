package test3533;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ExplicitFormula {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int pairCount = IntStream.range(0, 9)
                .flatMap(i -> IntStream.range(i + 1, 10)
                        .filter(j -> x[i] == 1 || x[j] == 1)
                )
                .map(j -> 1)
                .sum();

        int tripletCount = IntStream.range(0, 8)
                .flatMap(i -> IntStream.range(i + 1, 9)
                        .flatMap(j -> IntStream.range(j + 1, 10)
                                .filter(k -> x[i] == 1 || x[j] == 1 || x[k] == 1)))
                .map(k -> 1)
                .sum();

        bw.write((pairCount + tripletCount) % 2 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
