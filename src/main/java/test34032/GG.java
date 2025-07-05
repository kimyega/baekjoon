package test34032;

import java.io.*;

public class GG {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int hf = n % 2 == 0 ? n / 2 : n / 2 + 1;

    String line = br.readLine();

    int cnt = 0;
    for (char c : line.toCharArray()) {
      if (c == 'O') cnt++;
    }

    bw.write(cnt >= hf ? "Yes" : "No");

    bw.flush();
    bw.close();
    br.close();
  }
}
