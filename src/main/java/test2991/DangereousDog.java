package test2991;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class DangereousDog {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());

    List<Integer> workers = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

    StringBuilder sb = new StringBuilder();

    for (int time : workers) {
      int dogs = 0;

      if (isDangerous(time, a, b)) dogs++;
      if (isDangerous(time, c, d)) dogs++;

      sb.append(dogs).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static boolean isDangerous(int time, int attack, int calm) {
    int cycle = attack + calm;
    int mod = time % cycle;
    return mod != 0 && mod <= attack;
  }
}
