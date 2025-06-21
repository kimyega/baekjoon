package test31669;

import java.io.*;
import java.util.StringTokenizer;

public class EscapeFromSpecialSchool {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    char[][] map = new char[n][m];
    int res = 0;

    for (int i = 0; i < n; i++) {
      String line = br.readLine();
      map[i] = line.toCharArray();
    }

    for (int i = 0; i < m; i++) {
      boolean isFailed = false;

      for (int j = 0; j < n; j++) {
        char c = map[j][i];
        if (c != 'X') isFailed = true;
      }

      if (!isFailed) {
        res = i + 1;
        break;
      }
    }

    bw.write(res == 0 ? "ESCAPE FAILED" : res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
