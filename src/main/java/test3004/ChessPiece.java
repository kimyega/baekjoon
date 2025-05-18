package test3004;

import java.io.*;

public class ChessPiece {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int w = n / 2 + 1;
    int h = n - w + 2;

    int piece = w * h;
    bw.write(piece + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
