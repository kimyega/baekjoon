package test15059;

import java.io.*;
import java.util.StringTokenizer;

public class HardChoice {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    int unservedCount = 0;

    for (int i = 0; i < 3; i++) {
      int prep = Integer.parseInt(st1.nextToken());
      int req = Integer.parseInt(st2.nextToken());
      if (prep < req) {
        unservedCount += req - prep;
      }
    }

    bw.write(unservedCount + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
