package test11549;

import java.io.*;
import java.util.StringTokenizer;

public class IdentifyingTea {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String tea = br.readLine();
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()) {
      if (tea.equals(st.nextToken())) {
        count++;
      }
    }

    bw.write(count + "");
    br.close();
    bw.flush();
    bw.close();
  }
}
