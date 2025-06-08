package test30454;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindZebra {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());

    Pattern p = Pattern.compile("1+");
    Matcher m;

    Map<Integer, Integer> zebras = new HashMap<>();
    int max = 0;

    while (n-- > 0) {
      int cnt = 0;
      String zebra = br.readLine();
      m = p.matcher(zebra);

      while (m.find()) {
        cnt++;
      }

      zebras.put(cnt, zebras.getOrDefault(cnt, 0) + 1);
      max = Math.max(max, cnt);
    }

    bw.write(max + " " + zebras.get(max));

    bw.flush();
    bw.close();
    br.close();
  }
}
