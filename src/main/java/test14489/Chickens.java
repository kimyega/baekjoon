package test14489;

import java.io.*;
import java.util.StringTokenizer;

public class Chickens {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0;
    while (st.hasMoreTokens()) {
      sum += Integer.parseInt(st.nextToken());
    }
    int chick = Integer.parseInt(br.readLine()) * 2;
    int result = sum >= chick ? sum - chick : sum;
    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
