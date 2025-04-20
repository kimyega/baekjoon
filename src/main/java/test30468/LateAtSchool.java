package test30468;

import java.io.*;
import java.util.StringTokenizer;

public class LateAtSchool {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int sum = 0;
    for (int i = 0; i < 4; i++) {
      int num = Integer.parseInt(st.nextToken());
      sum += num;
    }

    int n = Integer.parseInt(st.nextToken());
    int needed = n * 4 - sum;
    int res = Math.max(0, needed);

    bw.write(String.valueOf(res));

    bw.flush();
    bw.close();
    br.close();
  }
}
