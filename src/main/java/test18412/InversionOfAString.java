package test18412;

import java.io.*;
import java.util.StringTokenizer;

public class InversionOfAString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    String str = br.readLine();

    String res = str.substring(0, a - 1) + new StringBuilder(str.substring(a - 1, b)).reverse() + str.substring(b);

    bw.write(res);
    bw.flush();
    bw.close();
    br.close();
  }
}
