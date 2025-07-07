package test27983;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RibbonEasy {

  static class Ribbon {
    private int x;
    private int l;
    private char c;

    Ribbon(int x, int l, char c) {
      this.x = x;
      this.l = l;
      this.c = c;
    }

    public boolean check (Ribbon ribbon) {
      return Math.abs(this.x - ribbon.x) <= this.l + ribbon.l && this.c != ribbon.c;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    StringTokenizer st3 = new StringTokenizer(br.readLine());

    List<Ribbon> ribbons = new ArrayList<>();

    while (st1.hasMoreTokens()) {
      int x = Integer.parseInt(st1.nextToken());
      int l = Integer.parseInt(st2.nextToken());
      char c = st3.nextToken().charAt(0);

      ribbons.add(new Ribbon(x, l, c));
    }

    boolean found = false;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (ribbons.get(i).check(ribbons.get(j))) {
          bw.write("YES\n");
          bw.write((i + 1) + " " + (j + 1) + "\n");
          found = true;
          break;
        }
      }
      if (found) break;
    }

    if (!found) {
      bw.write("NO\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
