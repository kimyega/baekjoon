package test33571;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hole {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int holeCnt = 0, uBCnt = 0, len = 0;

    String line = br.readLine();

    len = line.length();
    uBCnt = len - line.replaceAll("B", "").length();
    holeCnt += uBCnt * 2;

    String regex = "[AabDdegOoPpQqR@]";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(line);

    while (m.find()) {
      holeCnt++;
    }

    bw.write(holeCnt + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
