package test10810;

import java.io.*;
import java.util.StringTokenizer;

public class BallPutter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] baskets = new int[n];

    while (m-- > 0) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      for (int i = start; i <= end; i++) {
        baskets[i- 1] = k;
      }
    }

    StringBuilder sb = new StringBuilder();

    for(int basket : baskets) {
      sb.append(basket + " ");
    }

    bw.write(sb.toString().trim());

    bw.flush();
    bw.close();
    br.close();
  }
}
