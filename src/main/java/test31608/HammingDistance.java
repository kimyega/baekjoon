package test31608;

import java.io.*;

public class HammingDistance {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = 0;

    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    String t = br.readLine();

    for (int i = 0; i < n; i++) {
      char sc = s.charAt(i);
      char tc = t.charAt(i);

      if (sc != tc) {
        count++;
      }
    }

    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
