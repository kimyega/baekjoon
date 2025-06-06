package test5666;

import java.io.*;
import java.util.StringTokenizer;

public class HotDogs {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    String line = "";

    while ((line = br.readLine()) != null) {
      st = new StringTokenizer(line);
      int hotdogs = Integer.parseInt(st.nextToken());
      double people = Double.parseDouble(st.nextToken());

      sb.append(String.format("%.2f\n", hotdogs / people));
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
