package test31518;

import java.io.*;
import java.util.StringTokenizer;

public class TripleSevens {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = 3, count = 0;
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        if (st.nextToken().equals("7")) {
          count++;
          break;
        }
      }
    }

    int res = count == 3 ? 777 : 0;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
