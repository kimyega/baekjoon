package test8932;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class Heptathlon {

  static class HeptathlonScore {
    private double a;
    private double b;
    private double c;

    HeptathlonScore(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    int getScore(int p) {
      return (int) (a * Math.pow(Math.abs(b - p), c));
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    List<HeptathlonScore> scores = List.of(
            new HeptathlonScore(9.23076, 26.7, 1.835),
            new HeptathlonScore(1.84523, 75, 1.348),
            new HeptathlonScore(56.0211, 1.5, 1.05),
            new HeptathlonScore(4.99087, 42.5, 1.81),
            new HeptathlonScore(0.188807, 210, 1.41),
            new HeptathlonScore(15.9803, 3.8, 1.04),
            new HeptathlonScore(0.11193, 254, 1.88)
    );

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      int sum = 0;
      st = new StringTokenizer(br.readLine());

      for (HeptathlonScore score : scores) {
        int p = Integer.parseInt(st.nextToken());
        sum += score.getScore(p);
      }

      sb.append(sum + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
