package test4758;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class FillingOutTheTeam {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      StringJoiner sj = new StringJoiner(" ");

      st = new StringTokenizer(br.readLine());
      double speed = Double.parseDouble(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());
      int strength = Integer.parseInt(st.nextToken());
      if (speed == 0 && weight == 0 && strength == 0) break;

      if (speed <= 4.5 && weight >= 150 && strength >= 200) sj.add("Wide Receiver");
      if (speed <= 6.0 && weight >= 300 && strength >= 500) sj.add("Lineman");
      if (speed <= 5.0 && weight >= 200 && strength >= 300) sj.add("Quarterback");

      if (sj.length() == 0) sb.append("No positions");
      else sb.append(sj);

      sb.append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
