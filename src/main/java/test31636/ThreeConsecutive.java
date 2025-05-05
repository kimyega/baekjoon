package test31636;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeConsecutive {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String word = br.readLine();

    String regex = "o{3}";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(word);

    String res = m.find() ? "Yes" : "No";
    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }
}
