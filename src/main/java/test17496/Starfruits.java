package test17496;

import java.io.*;
import java.util.StringTokenizer;

public class Starfruits {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    int totalPrice = (n - 1) / t * c * p;
    bw.write(totalPrice + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
