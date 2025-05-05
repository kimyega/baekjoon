package test31656;

import java.io.*;

public class StickyKeys {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();

    String regex = "(.)\\1+"; // 아무 문자 1개 . 의 그룹 ()  1개 이상 연속 \1+
    String result = line.replaceAll(regex, "$1");   // $1 1번째 그룹
    bw.write(result);

    bw.flush();
    bw.close();
    br.close();
  }
}
