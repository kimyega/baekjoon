package test32209;

import java.io.*;
import java.util.StringTokenizer;

public class SeeYouNextMonth {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int forum = 0;
    boolean isAdios = false;

    int q = Integer.parseInt(br.readLine());

    while (q-- > 0) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      if (x == 1) {
        forum += y;
      } else if (x == 2) {
        if (forum < y) isAdios = true;
        else forum -= y;
      }
    }

    bw.write(isAdios ? "Adios" : "See you next month");

    bw.flush();
    bw.close();
    br.close();
  }
}
