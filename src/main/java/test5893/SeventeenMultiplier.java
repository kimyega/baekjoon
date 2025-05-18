package test5893;

import java.io.*;
import java.math.BigInteger;

public class SeventeenMultiplier {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String binaryStr = br.readLine();

    BigInteger num = new BigInteger(binaryStr, 2);
    num = num.multiply(BigInteger.valueOf(17));

    String numStr = num.toString(2);
    bw.write(numStr);

    bw.flush();
    bw.close();
    br.close();
  }
}
