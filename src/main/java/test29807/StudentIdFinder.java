package test29807;

import java.io.*;
import java.util.StringTokenizer;

public class StudentIdFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sbNo = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int lan = getNextOrZero(st);
    int math = getNextOrZero(st);
    int eng = getNextOrZero(st);
    int rsh = getNextOrZero(st);
    int lan2 = getNextOrZero(st);

    int schNo = Math.abs(lan - eng);
    if (lan > eng) {
      schNo *= 508;
    } else {
      schNo *= 108;
    }

    if (math > rsh) {
      schNo += Math.abs(math - rsh) * 212;
    } else {
      schNo += Math.abs(math - rsh) * 305;
    }

    if (sbNo == 5) {
      schNo += lan2 * 707;
    }

    schNo *= 4763;
    bw.write(schNo + "");

    bw.flush();
    bw.close();
    br.close();
  }
  static int getNextOrZero(StringTokenizer st) {
    return st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
  }
}
