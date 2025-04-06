package test15873;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoBlankPlus {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();
    int sum = 0;

    String regex = "10|[1-9]";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(line);
    while (m.find()) {
      sum += Integer.parseInt(m.group());
    }
    bw.write(sum + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
