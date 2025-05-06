package test29683;

import java.io.*;
import java.util.StringTokenizer;

public class ChristmasLottery {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int result = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      int rc = Integer.parseInt(st.nextToken());
      result += rc / a;
    }

    bw.write(result + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
