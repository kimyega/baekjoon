package test21955;

import java.io.*;

public class Split {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String nStr = br.readLine();

    bw.write(nStr.substring(0, nStr.length() / 2) + " " + nStr.substring(nStr.length() / 2));

    bw.flush();
    bw.close();
    br.close();
  }
}
