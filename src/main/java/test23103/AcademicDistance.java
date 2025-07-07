package test23103;

import java.io.*;
import java.util.StringTokenizer;

public class AcademicDistance {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int dt = 0;

    int n = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    int pa = Integer.parseInt(st.nextToken());
    int pb = Integer.parseInt(st.nextToken());

    for (int i = 1; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      dt += Math.abs(pa - a) + Math.abs(pb - b);
      pa = a;
      pb = b;
    }

    bw.write(dt + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
