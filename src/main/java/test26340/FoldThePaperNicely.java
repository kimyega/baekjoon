package test26340;

import java.io.*;
import java.util.StringTokenizer;

public class FoldThePaperNicely {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      String line = br.readLine();
      sb.append("Data set: " + line + "\n");

      StringTokenizer st = new StringTokenizer(line);
      int w = Integer.parseInt(st.nextToken());
      int h = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());


      while (n-- > 0) {
        if (w < h) {
          h /= 2;
        } else {
          w /= 2;
        }
      }

      int max = Math.max(w, h);
      int min = Math.min(w, h);
      sb.append(max + " " + min + "\n\n");
    }

    sb.delete(sb.length() - 2, sb.length());
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
