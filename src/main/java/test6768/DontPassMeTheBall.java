package test6768;

import java.io.*;

public class DontPassMeTheBall {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int cnt = 0;

    for (int i = 1; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          cnt++;
        }
      }
    }

    bw.write(cnt + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
