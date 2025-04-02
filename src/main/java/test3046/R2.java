package test3046;

import java.io.*;
import java.util.StringTokenizer;

public class R2 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int average = Integer.parseInt(st.nextToken());
    int num2 = average * 2 - num1;
    bw.write(num2 + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
