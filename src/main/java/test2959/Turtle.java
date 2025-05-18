package test2959;

import java.io.*;
import java.util.Arrays;

public class Turtle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");

    Arrays.sort(input);

    int x = Integer.parseInt(input[0]);
    int y = Integer.parseInt(input[2]);

    int res = x * y;
    bw.write(res + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
