package test18883;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class NMPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        IntStream.range(0, n).forEach(i -> {
            IntStream.range(1, m + 1).forEach(j -> {
                sb.append(m * i + j).append(" ");
            });

            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        });

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
