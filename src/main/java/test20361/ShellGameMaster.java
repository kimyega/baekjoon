package test20361;

import java.io.*;
import java.util.StringTokenizer;

public class ShellGameMaster {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int ball = x;
    while (k-- > 0) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (a == ball) {
        ball = b;
      } else if (b == ball) {
        ball = a;
      }
    }

    bw.write(ball + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
