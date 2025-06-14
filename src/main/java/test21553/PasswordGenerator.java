package test21553;

import java.io.*;

public class PasswordGenerator {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String a = br.readLine();
    String p = br.readLine();

    bw.write(p);

    bw.flush();
    bw.close();
    br.close();
  }
}
