package test17912;

import java.io.*;
import java.util.StringTokenizer;

public class LicenseToLaunch {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int min = Integer.MAX_VALUE, idx = 0;
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      int j = Integer.parseInt(st.nextToken());

      if (j < min) {
        idx = i;
        min = j;
      }
    }

    bw.write(idx + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
