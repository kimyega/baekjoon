package test1085;

import java.io.*;
import java.util.StringTokenizer;

public class EscapeRectangle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());

    int min = Math.min(Math.min(x, w - x), Math.min(y, h - y));
    bw.write(min + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
