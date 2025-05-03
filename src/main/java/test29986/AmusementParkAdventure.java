package test29986;

import java.io.*;
import java.util.StringTokenizer;

public class AmusementParkAdventure {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()) {
      int a = Integer.parseInt(st.nextToken());

      if (a <= h) {
        count++;
      }
    }

    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
