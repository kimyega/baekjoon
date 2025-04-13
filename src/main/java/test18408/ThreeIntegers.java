package test18408;

import java.io.*;

public class ThreeIntegers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int twoCount, oneCount, length;

    String line = br.readLine().replaceAll(" ", "");
    length = line.length();
    line = line.replaceAll("1", "");
    twoCount = line.length();
    oneCount = length - twoCount;

    if (oneCount < twoCount) {
      bw.write("2");
    } else {
      bw.write("1");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
