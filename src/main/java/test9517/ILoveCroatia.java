package test9517;

import java.io.*;
import java.util.StringTokenizer;

public class ILoveCroatia {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int startNo = Integer.parseInt(br.readLine());
    int caseNo = Integer.parseInt(br.readLine());
    int limitTime = 210, sumTime = 0;

    for (int i = 0; i < caseNo; i++) {
      st = new StringTokenizer(br.readLine());
      int time = Integer.parseInt(st.nextToken());
      String answer = st.nextToken();

      sumTime += time;

      if (sumTime > limitTime) continue;
      if (answer.equals("T")) startNo++;
    }

    int no = startNo % 8 == 0 ? 8 : startNo % 8;
    bw.write(no + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
