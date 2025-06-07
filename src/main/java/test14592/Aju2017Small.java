package test14592;

import java.io.*;
import java.util.StringTokenizer;

public class Aju2017Small {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int maxScore = 0, minSubCnt = Integer.MAX_VALUE, minLastTime = Integer.MAX_VALUE, res = 0;

    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());
      int score = Integer.parseInt(st.nextToken());
      int subCnt = Integer.parseInt(st.nextToken());
      int lastTime = Integer.parseInt(st.nextToken());


      if (score > maxScore) {
        maxScore = score;
        minSubCnt = subCnt;
        minLastTime = lastTime;
        res = i;
      } else if (score == maxScore) {
        if (subCnt < minSubCnt) {
          minSubCnt = subCnt;
          minLastTime = lastTime;
          res = i;
        } else if (subCnt == minSubCnt) {
          if (lastTime < minLastTime) {
            minLastTime = lastTime;
            res = i;
          }
        }
      }
    }

    bw.write(res + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
