package test13580;

import java.io.*;
import java.util.StringTokenizer;

public class AndandoNoTempo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    boolean isZero = false, isPair = false, isTempo = false;

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int sum = a + b + c;
    int max = Math.max(a, Math.max(b, c));

    if (a == 0 || b == 0 || c == 0) {
      isZero = true;
    } else if (a == b || b == c || c == a) {
      isPair = true;
    } else if (sum - max == max) {
      isTempo = true;
    }

    if (isZero || isPair || isTempo) {
      bw.write("S");
    } else {
      bw.write("N");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
