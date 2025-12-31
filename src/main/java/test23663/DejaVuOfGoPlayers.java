package test23663;

import java.io.*;
import java.util.StringTokenizer;

public class DejaVuOfGoPlayers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int T = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (T-- > 0) {
      st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      br.readLine();
      br.readLine();

      sb.append(n <= m ? "Yes" : "No").append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
