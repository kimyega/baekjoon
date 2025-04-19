package test28290;

import java.io.*;

public class Outdoors {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();


    StringBuilder sb = new StringBuilder();

    if (str.equals("fdsajkl;") || str.equals("jkl;fdsa")) {
      sb.append("in-out");
    } else if (str.equals("asdf;lkj") || str.equals(";lkjasdf")) {
      sb.append("out-in");
    } else if (str.equals("asdfjkl;")) {
      sb.append("stairs");
    } else if (str.equals(";lkjfdsa")) {
      sb.append("reverse");
    } else {
      sb.append("molu");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
