package test14209;

import java.io.*;

public class Bridz {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    int points = 0;

    while (n-- > 0) {

      String line = br.readLine();

      for(char c : line.toCharArray()) {
        if (c == 'A') points += 4;
        else if (c == 'K') points += 3;
        else if (c == 'Q') points += 2;
        else if (c == 'J') points += 1;
      }
    }

    bw.write(points + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
