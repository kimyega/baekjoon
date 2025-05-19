package test14656;

import java.io.*;
import java.util.StringTokenizer;

public class SadisticTA {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int nc = 0;

    int std = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= std; i++) {
      int n = Integer.parseInt(st.nextToken());

      if (n != i) nc++;
    }

    bw.write(nc + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
