package test32025;

import java.io.*;

public class ExerciseIsMath {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int w = Integer.parseInt(br.readLine());
    int h = Integer.parseInt(br.readLine());

    int r = (int) (Math.min(w, h) / 2.0 * 100);

    bw.write(r + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
