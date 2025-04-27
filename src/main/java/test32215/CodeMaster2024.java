package test32215;

import java.io.*;
import java.util.StringTokenizer;

public class CodeMaster2024 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int sum = k * m + m;
    bw.write(sum + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
