package test5340;

import java.io.*;
import java.util.StringJoiner;

public class SecretLocation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    sb.append("Latitude ");

    StringJoiner sj = new StringJoiner(":");

    String line = "";
    int cnt = 0;

    while ((line = br.readLine()) != null) {
      cnt++;
      sj.add(line.trim().length() + "");

      if (cnt == 3) {
        sb.append(sj).append("\nLongitude ");
        sj = new StringJoiner(":");
      }
    }

    sb.append(sj);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
