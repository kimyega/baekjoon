package test10988;

import java.io.*;

public class PalindromeChecker {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String word = br.readLine();
    String reverse = new StringBuilder(word).reverse().toString();

    bw.write(word.equals(reverse) ? "1" : "0");

    bw.flush();
    bw.close();
    br.close();
  }
}
