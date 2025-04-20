package test31922;

import java.io.*;
import java.util.StringTokenizer;

public class ContestIsMine {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int div1 = Integer.parseInt(st.nextToken());
    int div2 = Integer.parseInt(st.nextToken());
    int shake = Integer.parseInt(st.nextToken());

    int res = Math.max(div1 + shake, div2);
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
