package test14470;

import java.io.*;

public class Microwave {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int start = Integer.parseInt(br.readLine());
    int end = Integer.parseInt(br.readLine());
    int neg = Integer.parseInt(br.readLine());
    int zero = Integer.parseInt(br.readLine());
    int pos = Integer.parseInt(br.readLine());

    int negCount = 0, zeroCount = 0, posCount = 0;
    for (int i = start; i <= end; i++) {
          if (i < 0) negCount++;
          else if (i == 0) zeroCount++;
          else posCount++;
    }

    if (start < 0 && neg < 0) negCount--;
    else if (start > 0 && neg > 0) posCount--;

    int result = neg * negCount + zero * zeroCount + pos * posCount;
    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
