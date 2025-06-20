package test13129;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class DisposableCup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int edgeLen = a * n;

        StringBuilder sb = new StringBuilder();

        IntStream.rangeClosed(1, n)
                .forEach(i -> {
                    sb.append(edgeLen + i * b + " ");
                });

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}
