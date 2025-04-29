package test26500;

import java.io.*;
import java.util.StringTokenizer;

public class Absolutely {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int caseNo = Integer.parseInt(br.readLine());

      StringBuilder sb = new StringBuilder();

      while (caseNo-- > 0) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          double a = Double.parseDouble(st.nextToken());
          double b = Double.parseDouble(st.nextToken());

          String s = String.format("%.1f", Math.abs(a - b));
          sb.append(s + "\n");
      }

      sb.deleteCharAt(sb.length() - 1);
      bw.write(sb.toString());

      bw.flush();
      bw.close();
      br.close();
    }
}
