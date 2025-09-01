package test30310;

import java.io.*;
import java.util.Arrays;

public class FindingForks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int res = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .limit(2)
                .sum();

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
