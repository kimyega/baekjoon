package test17201;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MagnetChain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String chains = br.readLine();

    Pattern p = Pattern.compile("..");
    Matcher m = p.matcher(chains);

    char lc = chains.charAt(1);
    boolean isChain = true;

    while (m.find()) {
      char pc = m.group().charAt(0);

      if (pc == lc) isChain = false;

      lc = m.group().charAt(1);
    }

    bw.write(isChain ? "Yes" : "No");

    bw.flush();
    bw.close();
    br.close();
  }
}
