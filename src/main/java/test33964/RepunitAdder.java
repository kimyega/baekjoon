package test33964;

import java.io.*;
import java.util.StringTokenizer;

public class RepunitAdder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String one = "1", two = "2";

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int pre = Math.abs(a - b), end = Math.min(a, b);

    String res = one.repeat(pre) + two.repeat(end);
    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }
}
