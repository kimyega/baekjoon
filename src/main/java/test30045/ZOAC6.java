package test30045;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZOAC6 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = 0;
    int caseNo = Integer.parseInt(br.readLine());

    String regex = ".*(01|OI).*";
    Pattern p = Pattern.compile(regex);
    Matcher m;

    while (caseNo-- > 0) {
      String s = br.readLine();

      m = p.matcher(s);

      if (m.matches()) {
        count++;
      }
    }

    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
