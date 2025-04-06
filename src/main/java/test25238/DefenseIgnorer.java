package test25238;

import java.io.*;
import java.util.StringTokenizer;

public class DefenseIgnorer {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int defenseRate = a * (100 - b) / 100;
    if (defenseRate >= 100) {
      bw.write("0");
    } else {
      bw.write("1");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
