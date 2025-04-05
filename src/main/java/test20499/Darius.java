package test20499;

import java.io.*;
import java.util.StringTokenizer;

public class Darius {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine(), "/");
    int kill = Integer.parseInt(st.nextToken());
    int death = Integer.parseInt(st.nextToken());
    int assist = Integer.parseInt(st.nextToken());
    if (kill + assist < death || death == 0) {
      bw.write("hasu\n");
    } else {
      bw.write("gosu\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
