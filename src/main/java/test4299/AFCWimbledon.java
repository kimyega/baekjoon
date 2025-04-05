package test4299;

import java.io.*;
import java.util.StringTokenizer;

public class AFCWimbledon {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = Integer.parseInt(st.nextToken());
    int diff = Integer.parseInt(st.nextToken());


    if ((sum + diff) % 2 != 0 || sum < diff) {
      bw.write("-1");
    } else {
      int a = (sum + diff) / 2;
      int b = sum - a;
      bw.write(Math.max(a, b) + " " + Math.min(a, b));
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
