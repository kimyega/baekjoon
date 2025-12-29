package test25278;

import java.io.*;
import java.util.StringTokenizer;

public class Terraforming {
  static class Planet {
    private int ocean;
    private int temperature;
    private int oxygen;
    private StringTokenizer st;

    public Planet() {
      ocean = 0;
      temperature = -30;
      oxygen = 0;
    }

    public void change(String line) {
      st = new StringTokenizer(line);
      String env = st.nextToken();
      int temp = Integer.parseInt(st.nextToken());

      switch (env) {
        case "ocean":         ocean += temp;            break;
        case "temperature":   temperature += temp;      break;
        case "oxygen":        oxygen += temp;           break;
      }
    }

    public String isLiveable() {
      return this.ocean >= 9 && this.oxygen >= 14 && this.temperature >= 8 ? "liveable" : "not liveable";
    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    Planet planet = new Planet();

    while (n-- > 0) {
      String line = br.readLine();
      planet.change(line);
    }

    bw.write(planet.isLiveable());

    bw.flush();
    bw.close();
    br.close();
  }
}
