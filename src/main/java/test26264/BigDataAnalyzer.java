package test26264;

import java.io.*;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigDataAnalyzer {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    String line = br.readLine();

    String regexSec = "security";
    String regexBig = "bigdata";

    Pattern ps = Pattern.compile(regexSec);
    Pattern pb = Pattern.compile(regexBig);

    Matcher ms = ps.matcher(line);
    Matcher mb = pb.matcher(line);

    int cntSec = 0, cntBig = 0;

    while (ms.find()) cntSec++;
    while (mb.find()) cntBig++;

    StringJoiner sj = new StringJoiner(" ");

    if (cntSec <= cntBig) sj.add("bigdata?");
    if (cntSec >= cntBig) sj.add("security!");

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
