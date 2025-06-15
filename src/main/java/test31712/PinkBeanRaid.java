package test31712;

import java.io.*;
import java.util.StringTokenizer;

public class PinkBeanRaid {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int c1 = Integer.parseInt(st.nextToken());
    int d1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int c2 = Integer.parseInt(st.nextToken());
    int d2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int c3 = Integer.parseInt(st.nextToken());
    int d3 = Integer.parseInt(st.nextToken());

    int h = Integer.parseInt(br.readLine());

    int idx = 0;
    while (true){
      if (idx % c1 == 0) h -= d1;
      if (idx % c2 == 0) h -= d2;
      if (idx % c3 == 0) h -= d3;
      if (h <= 0) break;
      idx++;
    }

    bw.write(idx + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
