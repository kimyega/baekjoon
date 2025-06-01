package test15734;

import java.io.*;
import java.util.StringTokenizer;

public class MasterNamJeongHoon {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int l = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());

    int max = Math.max(l, r);
    int min = Math.min(l, r);
    int diff = max - min;

    int res = diff < a ? (max + (a - diff) / 2) * 2 : (min + a) * 2;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
