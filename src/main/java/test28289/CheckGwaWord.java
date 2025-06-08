package test28289;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CheckGwaWord {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Map<Integer, Integer> gwa = new HashMap<>();
    gwa.put(1, 0);
    gwa.put(3, 0);
    gwa.put(4, 0);

    int n = Integer.parseInt(br.readLine());

    int gd1Cnt = 0;

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int grade = Integer.parseInt(st.nextToken());
      int ban = Integer.parseInt(st.nextToken());
      int no = Integer.parseInt(st.nextToken());

      if (grade == 1) {
        gd1Cnt++;
        continue;
      }

      if (ban == 2) gwa.put(1, gwa.get(1) + 1);
      else gwa.put(ban, gwa.get(ban) + 1);
    }

    StringBuilder sb = new StringBuilder();

    for (Map.Entry<Integer, Integer> entry : gwa.entrySet()) {
      sb.append(entry.getValue()).append("\n");
    }

    sb.append(gd1Cnt);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
