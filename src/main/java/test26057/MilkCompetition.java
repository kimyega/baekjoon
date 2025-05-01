package test26057;

import java.io.*;

public class MilkCompetition {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int l = Integer.parseInt(br.readLine());
    int t = Integer.parseInt(br.readLine());

    int b = t * 2 - l;
    bw.write(b + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
