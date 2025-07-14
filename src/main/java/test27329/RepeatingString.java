package test27329;

import java.io.*;

public class RepeatingString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String line = br.readLine();

    int half = n / 2;
    String left = line.substring(0, half);
    String right = line.substring(half);

    boolean isRepeat = true;

    for (int i = 0; i < half; i++) {
      if (left.charAt(i) != right.charAt(i)) isRepeat = false;
    }

    bw.write(isRepeat ? "Yes" : "No");

    bw.flush();
    bw.close();
    br.close();
  }
}
