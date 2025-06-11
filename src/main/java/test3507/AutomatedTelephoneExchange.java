package test3507;

import java.io.*;
import java.util.stream.IntStream;

public class AutomatedTelephoneExchange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        long cnt = IntStream.rangeClosed(1, 99)
                .filter(i -> n - i <= 99 && n - i >= 0)
                .count();

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
