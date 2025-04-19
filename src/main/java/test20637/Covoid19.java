package test20637;

import java.io.*;

public class Covoid19 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int casesPerMill = Integer.parseInt(br.readLine());
    int hospPerMill = Integer.parseInt(br.readLine());

    if (casesPerMill <= 50 && hospPerMill <= 10) {
      bw.write("White");
    } else if (hospPerMill > 30) {
      bw.write("Red");
    } else {
      bw.write("Yellow");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
