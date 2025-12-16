package test17884;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class LostLineup {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] org = new int[N];
    org[0] = 1;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 2; i <= N; i++) {
      int idx = Integer.parseInt(st.nextToken());
      org[++idx] = i;
    }

    String result = Arrays.stream(org)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" "));

    bw.write(result);

    bw.flush();
    bw.close();
    br.close();
  }
}
