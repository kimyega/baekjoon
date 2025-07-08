package test30792;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class GahuiAndSousenkyo2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    List<Integer> ranking = new ArrayList<>();

    int guhui = Integer.parseInt(br.readLine());

    ranking.add(guhui);

    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      int v = Integer.parseInt(st.nextToken());
      ranking.add(v);
    }

    Collections.sort(ranking, Collections.reverseOrder());

    bw.write(ranking.indexOf(guhui) + 1 + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
