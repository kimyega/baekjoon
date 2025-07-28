package test13871;

import java.io.*;
import java.util.StringTokenizer;

public class FarmRobot {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());


    int currNo = 1, result = 0;
    if (currNo == s) result++;

    st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()) {
      int move = Integer.parseInt(st.nextToken());

      currNo += move;
      if (currNo == 0) currNo = n;
      else if (currNo == n + 1) currNo = 1;
      if (currNo == s) result++;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}
