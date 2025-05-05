package test20336;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class HaughtyCuisine {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    List<String[]> menu = new ArrayList<>();

    int caseNo= Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());

      String[] items = new String[n];
      for (int i = 0; i < n; i++) {
        items[i] = st.nextToken();
      }

      menu.add(items);
    }

    Random rand = new Random();
    int idx = rand.nextInt(menu.size());

    StringBuilder sb = new StringBuilder();
    sb.append(menu.get(idx).length).append("\n");

    for (String item : menu.get(idx)) {
      sb.append(item).append("\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
