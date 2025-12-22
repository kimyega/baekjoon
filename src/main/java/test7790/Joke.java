package test7790;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Joke {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Pattern p = Pattern.compile("joke");
    Matcher m;

    String line = "";
    int count = 0;

    StringBuilder sb = new StringBuilder();

    while ((line = br.readLine()) != null) {
      sb.append(line).append("\n");
    }


    m = p.matcher(sb.toString());

    while (m.find()) count++;

    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
