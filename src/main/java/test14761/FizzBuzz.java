package test14761;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());


        String result = IntStream.rangeClosed(1, n)
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder();

                    if (i % x == 0 && i % y == 0) sb.append("FizzBuzz");
                    else if (i % x == 0) sb.append("Fizz");
                    else if (i % y == 0) sb.append("Buzz");
                    else sb.append(i);

                    sb.append("\n");
                    return sb.toString();
                })
                .collect(Collectors.joining());

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
