package test9772;

import java.io.*;
import java.util.StringTokenizer;

public class Quadrants {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String line = "";
    StringBuilder sb = new StringBuilder();

    while ((line = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(line);
      double x = Double.parseDouble(st.nextToken());
      double y = Double.parseDouble(st.nextToken());

      String qdt = x > 0 && y > 0 ? "Q1" : x < 0 && y > 0 ? "Q2" : x < 0 && y < 0 ? "Q3" : x > 0 && y < 0 ? "Q4" : "AXIS";
      sb.append(qdt + "\n");

      if (line.equals("0 0")) break;
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
