package test26933;

import java.io.*;
import java.util.StringTokenizer;

public class Receptet {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int res = 0;

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      int diff = b - h;
      if (diff > 0) res += diff * k;
    }

    bw.write(res + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
