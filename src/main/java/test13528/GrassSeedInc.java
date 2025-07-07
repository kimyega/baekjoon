package test13528;

import java.io.*;
import java.util.StringTokenizer;

public class GrassSeedInc {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    double cost = 0;

    double c = Double.parseDouble(br.readLine());
    int l = Integer.parseInt(br.readLine());

    while (l-- > 0) {
      st = new StringTokenizer(br.readLine());
      double wi = Double.parseDouble(st.nextToken());
      double li = Double.parseDouble(st.nextToken());

      cost += wi * li * c;
    }

    bw.write(cost + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
