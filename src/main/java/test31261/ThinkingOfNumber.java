package test31261;

import java.io.*;
import java.util.StringTokenizer;

public class ThinkingOfNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int x = ((a + b) * a + a) * a;
    bw.write(x + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
