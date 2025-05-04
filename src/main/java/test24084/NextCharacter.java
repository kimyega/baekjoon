package test24084;

import java.io.*;

public class NextCharacter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char pre = 0;

    int n = Integer.parseInt(br.readLine());
    String word = br.readLine();

    StringBuilder sb = new StringBuilder();

    for (char c : word.toCharArray()) {
      if (pre != 0 && c == 'J') {
        sb.append(pre).append("\n");
      }

      pre = c;
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
