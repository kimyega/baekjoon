package test6437;

import java.io.*;
import java.util.StringTokenizer;

public class Golf {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 1; ; i++){
      String res = "";
      st = new StringTokenizer(br.readLine());
      int p = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());

      if (p == 0 && s == 0) break;

      int diff = s - p;

      if (s == 1) res = "Hole-in-one";
      else if (diff == 0) res = "Par";
      else if (diff == -1) res = "Birdie";
      else if (diff == 1) res = "Bogey";
      else if (diff == -2) res = "Eagle";
      else if (diff == -3) res = "Double eagle";
      else res = "Double bogey";

      sb.append("Hole #").append(i).append("\n");
      sb.append(res).append(".\n\n");
    }

    sb.delete(sb.length() - 2, sb.length());
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
