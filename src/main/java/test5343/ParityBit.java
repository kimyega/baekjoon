package test5343;

import java.io.*;

public class ParityBit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (n-- > 0) {
      int errors = 0;
      String data = br.readLine();

      for (int i = 0; i < data.length(); i += 8) {

        int cnt = 0;
        String block = data.substring(i, i + 8);
        String dataBits = block.substring(0, 7);
        char parityBit = block.charAt(7);

        for (char c : dataBits.toCharArray()) {
          if (c == '1') cnt++;
        }
        char correctBit = cnt % 2 != 0 ? '1' : '0';

        errors += correctBit != parityBit ? 1 : 0;
      }

      sb.append(errors).append('\n');
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
