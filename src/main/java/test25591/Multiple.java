package test25591;

import java.io.*;
import java.util.StringTokenizer;

public class Multiple {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = 100 - Integer.parseInt(st.nextToken());
    int b = 100 - Integer.parseInt(st.nextToken());
    int c = 100 - (a + b);
    int d = a * b;
    int q = d / 100;
    int r = d % 100;

    int pre = c + q;
    int post = r;

    StringBuilder sb = new StringBuilder();
    sb.append(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n" + pre + " " + post);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
