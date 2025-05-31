package test27465;

import java.io.*;

public class NonPrimeNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    bw.write(getNonPrime(n) + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  static int getNonPrime(int n) {
    return isNonPrime(n) ? n : getNonPrime(++n);
  }

  static boolean isNonPrime(int n) {

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return true;
    }

    return false;
  }
}
