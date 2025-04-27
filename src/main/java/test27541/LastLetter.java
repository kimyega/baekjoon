package test27541;

import java.io.*;

public class LastLetter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String word = br.readLine();

    String res = word.charAt(n - 1) == 'G' ? word.substring(0, n - 1) : word + 'G';
    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }
}
