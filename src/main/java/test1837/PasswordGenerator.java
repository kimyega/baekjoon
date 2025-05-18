package test1837;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class PasswordGenerator {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger password = new BigInteger(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    boolean isBadPwd = false;
    int num = 0;

    for (int i = 2; i < k; i++) {
      if (password.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
        isBadPwd = true;
        num = i;
        break;
      }
    }

    bw.write(isBadPwd ? "BAD " + num : "GOOD");

    bw.flush();
    bw.close();
    br.close();
  }
}
