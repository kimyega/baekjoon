package test8710;

import java.io.*;
import java.util.StringTokenizer;

public class Koszykarz {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int num = (int) Math.ceil((w - k) / (double) m);

    bw.write(num + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
