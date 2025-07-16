package test33631;

import java.io.*;
import java.util.StringTokenizer;

public class HomeClass01 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    int fs = Integer.parseInt(st.nextToken());
    int cs = Integer.parseInt(st.nextToken());
    int es = Integer.parseInt(st.nextToken());
    int bs = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int f = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int queryNo = Integer.parseInt(br.readLine());

    int cookieCount = 0;

    while (queryNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int q = Integer.parseInt(st.nextToken());
      int i = Integer.parseInt(st.nextToken());

      if (q == 1) {
        int cookies = Math.min(fs / f, Math.min(cs / c, Math.min(es / e, bs / b)));
        if (cookies >= i) {
          cookieCount += i;
          sb.append(cookieCount);
          fs -= i * f;
          cs -= i * c;
          es -= i * e;
          bs -= i * b;
        } else {
          sb.append("Hello, siumii");
        }
      } else if (q == 2) {
        fs += i;
        sb.append(fs);
      } else if (q == 3) {
        cs += i;
        sb.append(cs);
      } else if (q == 4) {
        es += i;
        sb.append(es);
      } else if (q == 5) {
        bs += i;
        sb.append(bs);
      }

      sb.append('\n');
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
