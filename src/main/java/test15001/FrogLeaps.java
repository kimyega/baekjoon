package test15001;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FrogLeaps {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long n = read(), p = read(), x, sum = 0;
    for (; n > 1; n--, p = x) sum += (long) Math.pow((x = read()) - p, 2);

    bw.write(String.valueOf(sum));
    bw.flush();
  }

  private static long read() throws IOException {
    long c, n = System.in.read() & 15;
    while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

    return n;
  }

}

