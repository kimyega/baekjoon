package test27267;

import java.io.*;
import java.util.StringTokenizer;

public class RoomComparison {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());

    boolean isPeta = a * b < c * d;
    boolean isSame = a * b == c * d;

    String s = isSame ? "E" : isPeta ? "P" : "M";
    bw.write(s);

    bw.flush();
    bw.close();
    br.close();
  }
}
