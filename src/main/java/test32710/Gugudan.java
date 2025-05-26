package test32710;

import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Gugudan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        AtomicBoolean isGugudan = new AtomicBoolean(false);

        IntStream.range(2, 10).forEach(i -> {
            if (n % i == 0 && n / i < 10 || n == 1) isGugudan.set(true);
        });

        bw.write(isGugudan.get() ? "1" : "0");

        bw.flush();
        bw.close();
        br.close();
    }
}
