package test25904;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HelloCleopatra {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int res = 0;

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    List<Integer> pitchList = new ArrayList<>();

    while (st.hasMoreTokens()) {
      int t = Integer.parseInt(st.nextToken());
      pitchList.add(t);
    }

    for (int i = 0; ; i++) {
      int no = i % n;

      if (pitchList.get(no) < x) {
        res = no + 1;
        break;
      }

      x++;
    }

    bw.write(res + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
