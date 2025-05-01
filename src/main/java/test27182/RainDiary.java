package test27182;

import java.io.*;
import java.util.StringTokenizer;

public class RainDiary {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int d = m > n && n > 7 ? n - 7 : m + 7;
    bw.write(d + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
