package test13773;

import java.io.*;

public class OlympicGames {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    while (true) {
      int year = Integer.parseInt(br.readLine());
      if (year == 0) break;

      sb.append(year).append(" ");

      if (year >= 1896 && (year - 1896) % 4 == 0){
        if (year == 1916 || year == 1940 || year == 1944) sb.append("Games cancelled");
        else if (year >= 2024) sb.append("No city yet chosen");
        else sb.append("Summer Olympics");
      } else {
        sb.append("No summer games");
      }

      sb.append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
