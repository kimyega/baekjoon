package test24075;

import java.io.*;
import java.util.StringTokenizer;

public class Calculation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int max = Math.max(a + b, a - b);
    int min = Math.min(a + b, a - b);

    bw.write(max + "\n" + min);

    bw.flush();
    bw.close();
    br.close();
  }
}
