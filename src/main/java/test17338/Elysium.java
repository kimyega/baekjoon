package test17338;

import java.io.*;
import java.util.StringTokenizer;

public class Elysium {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0, min = 0, index = 0;
    String univ = "";
    while (st.hasMoreTokens()) {
      int activeScore = Integer.parseInt(st.nextToken());
      if (index == 0) {
        min = activeScore;
      } else if (index == 1) {
        if (activeScore < min) {
          min = activeScore;
          univ = "Korea";
        } else {
          univ = "Soongsil";
        }
      } else {
        if (activeScore < min) {
          univ = "Hanyang";
        }
      }
      sum += activeScore;
      index++;
    }
    if (sum >= 100) {
      bw.write("OK");
    } else {
      bw.write(univ);
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
