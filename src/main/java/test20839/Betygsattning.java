package test20839;

import java.io.*;
import java.util.StringTokenizer;

public class Betygsattning {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    String grade = "";

    int x = Integer.parseInt(st1.nextToken());
    int y = Integer.parseInt(st1.nextToken());
    int z = Integer.parseInt(st1.nextToken());

    int x1 = Integer.parseInt(st2.nextToken());
    int y1 = Integer.parseInt(st2.nextToken());
    int z1 = Integer.parseInt(st2.nextToken());

    if (x1 >= x && y1 >= y && z1 >= z) {
      grade = "A";
    } else if (x1 >= pairChange(x) && y1 >= y && z1 >= z) {
      grade = "B";
    } else if (y1 >= y && z1 >= z) {
      grade = "C";
    } else if (y1 >= pairChange(y) && z1 >= z) {
      grade = "D";
    } else if (z1 >= z) {
      grade = "E";
    }

    bw.write(grade);

    bw.flush();
    bw.close();
    br.close();
  }
  static int pairChange(int n) {
    return (n % 2 == 0 ? n / 2 : (n + 1) / 2);
  }
}
