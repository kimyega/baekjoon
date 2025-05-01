package test26495;

import java.io.*;

public class BigNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] numbers = {
                    "0000 \n" +
                    "0  0 \n" +
                    "0  0 \n" +
                    "0  0 \n" +
                    "0000 ",
                    "   1 \n" +
                    "   1 \n" +
                    "   1 \n" +
                    "   1 \n" +
                    "   1 ",
                    "2222 \n" +
                    "   2 \n" +
                    "2222 \n" +
                    "2    \n" +
                    "2222 ",
                    "3333 \n" +
                    "   3 \n" +
                    "3333 \n" +
                    "   3 \n" +
                    "3333 ",
                    "4  4 \n" +
                    "4  4 \n" +
                    "4444 \n" +
                    "   4 \n" +
                    "   4 ",
                    "5555 \n" +
                    "5    \n" +
                    "5555 \n" +
                    "   5 \n" +
                    "5555",
                    "6666 \n" +
                    "6    \n" +
                    "6666 \n" +
                    "6  6 \n" +
                    "6666 ",
                    "7777 \n" +
                    "   7 \n" +
                    "   7 \n" +
                    "   7 \n" +
                    "   7 ",
                    "8888 \n" +
                    "8  8 \n" +
                    "8888 \n" +
                    "8  8 \n" +
                    "8888 ",
                    "9999 \n" +
                    "9  9 \n" +
                    "9999 \n" +
                    "   9 \n" +
                    "   9 "
    };

    String nStr = br.readLine();

    StringBuilder sb = new StringBuilder();

    for (char c : nStr.toCharArray()) {
      int num = c - '0';

      sb.append(numbers[num]);
      sb.append("\n\n");
    }

    sb.delete(sb.length() - 2, sb.length());
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
