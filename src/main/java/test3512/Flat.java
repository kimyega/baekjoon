package test3512;

import java.io.*;
import java.util.StringTokenizer;

public class Flat {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int toti = 0, bedi = 0;
    double price = 0;

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      double ai = Double.parseDouble(st.nextToken());
      String ti = st.nextToken();

      toti += ai;
      if (ti.equals("bedroom")) bedi += ai;
      if (ti.equals("balcony")) ai /= 2.0;

      price += ai * c;
    }

    bw.write(toti + "\n" + bedi + "\n" + price + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
