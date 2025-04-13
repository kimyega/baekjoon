package test28352;

import java.io.*;

public class Pectorial {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    long week = 6;
    for (int i = n; i > 10; i--) {
      week *= i;
    }

    bw.write(week + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
