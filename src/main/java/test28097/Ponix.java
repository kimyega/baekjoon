package test28097;

import java.io.*;
import java.util.StringTokenizer;

public class Ponix {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int day = 0, hour = 0;
    int caseNo = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int length = st.countTokens();
    while (st.hasMoreTokens()) {
      hour += Integer.parseInt(st.nextToken());
    }

    hour += (length - 1) * 8;
    day = hour / 24;
    hour = hour % 24;

    bw.write(day + " " + hour);

    bw.flush();
    bw.close();
    br.close();
  }
}
