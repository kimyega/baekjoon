package test24079;

import java.io.*;

public class Moving {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int z = Integer.parseInt(br.readLine());

    String str = x + y <= z ? "1" : "0";
    bw.write(str);

    bw.flush();
    bw.close();
    br.close();
  }
}
