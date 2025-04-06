package test14924;

import java.io.*;
import java.util.StringTokenizer;

public class VonNeumann {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int s = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());
    int result = d / (s * 2) * t;
    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
