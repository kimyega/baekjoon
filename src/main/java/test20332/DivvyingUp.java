package test20332;

import java.io.*;
import java.util.Arrays;

public class DivvyingUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sum();

        bw.write(sum % 3 == 0 ? "yes" : "no");

        bw.flush();
        bw.close();
        br.close();
    }
}
