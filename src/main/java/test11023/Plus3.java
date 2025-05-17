package test11023;

import java.io.*;
import java.util.StringTokenizer;

public class Plus3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sum = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      sum += Integer.parseInt(st.nextToken());
    }

    bw.write(sum + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
