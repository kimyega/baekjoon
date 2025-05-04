package test33689;

import java.io.*;

public class CPDU {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int count = 0;
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      String word = br.readLine();
      char ch = word.charAt(0);

      if (ch == 'C') {
        count++;
      }
    }

    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
