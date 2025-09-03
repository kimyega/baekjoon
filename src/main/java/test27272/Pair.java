package test27272;

import java.io.*;
import java.util.Arrays;

public class Pair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int result = nums[0] * nums[1] + nums[2] * nums[3];

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
