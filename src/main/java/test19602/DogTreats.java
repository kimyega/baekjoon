package test19602;

import java.io.*;

public class DogTreats {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int s = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    int l = Integer.parseInt(br.readLine());

    int res = s + m * 2 + l * 3;
    if (res < 10) {
      bw.write("sad");
    } else {
      bw.write("happy");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
