package test16546;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingRunners {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        List<Integer> runners = Arrays.stream(input.split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int result = IntStream.rangeClosed(1, n)
                    .filter(i -> !runners.contains(i))
                    .findFirst()
                    .orElse(-1);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
