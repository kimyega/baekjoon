package test30794;

import java.io.*;
import java.util.StringTokenizer;

public class ClubAudition {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int lv = Integer.parseInt(st.nextToken());
    String judgment = st.nextToken();
    int score = lv;

    if (judgment.equals("miss")) {
      score *= 0;
    } else if (judgment.equals("bad")) {
      score *= 200;
    } else if (judgment.equals("cool")) {
      score *= 400;
    } else if (judgment.equals("great")) {
      score *= 600;
    } else if (judgment.equals("perfect")) {
      score *= 1000;
    }

    bw.write(score + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
