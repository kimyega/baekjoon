package test4435;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class MiddleEarthWar {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int caseNo = Integer.parseInt(br.readLine());

    List<Integer> gandalf = Arrays.asList(1, 2, 3, 3, 4, 10);
    List<Integer> sauron = Arrays.asList(1, 2, 2, 2, 3, 5, 10);

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= caseNo; i++) {
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      int gandalfScore = IntStream.range(0, gandalf.size())
                                  .map(k -> Integer.parseInt(st1.nextToken()) * gandalf.get(k))
                                  .sum();

      StringTokenizer st2 = new StringTokenizer(br.readLine());
      int sauronScore = IntStream.range(0, sauron.size())
                                  .map(k -> Integer.parseInt(st2.nextToken()) * sauron.get(k))
                                  .sum();

      String result = gandalfScore == sauronScore ? "No victor on this battle field" : gandalfScore > sauronScore ? "Good triumphs over Evil" : "Evil eradicates all trace of Good";
      sb.append("Battle ").append(i).append(": ").append(result).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
