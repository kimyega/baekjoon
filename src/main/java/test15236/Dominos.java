package test15236;

import java.io.*;
import java.util.stream.IntStream;

public class Dominos {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int spot = IntStream.rangeClosed(0, n)
            .flatMap(i -> IntStream.rangeClosed(0, i).map(j -> i + j))
            .sum();

    bw.write(spot + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
