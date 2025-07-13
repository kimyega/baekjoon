package test8678;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Zbior {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      boolean containsDiv = true;

      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      Set<Integer> aDiv = new HashSet<>();

      for (int i = 1; i <= a; i++) {
        if (a % i == 0) aDiv.add(i);
      }

      Set<Integer> bDiv = new HashSet<>();

      for (int i = 1; i <= b; i++) {
        if (b % i == 0) bDiv.add(i);
      }

      for (int div : aDiv) {
        if (!bDiv.contains(div)) {
          containsDiv = false;
          break;
        }
      }

      sb.append(containsDiv ? "TAK" : "NIE").append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
