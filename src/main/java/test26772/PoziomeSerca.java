package test26772;

import java.io.*;

public class PoziomeSerca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String bl = " ";
        bw.write((" @@@   @@@ " + bl).repeat(n) + "\n");
        bw.write(("@   @ @   @" + bl).repeat(n) + "\n");
        bw.write(("@    @    @" + bl).repeat(n) + "\n");
        bw.write(("@         @" + bl).repeat(n) + "\n");
        bw.write((" @       @ " + bl).repeat(n) + "\n");
        bw.write(("  @     @  " + bl).repeat(n) + "\n");
        bw.write(("   @   @   " + bl).repeat(n) + "\n");
        bw.write(("    @ @    " + bl).repeat(n) + "\n");
        bw.write(("     @     " + bl).repeat(n));

        bw.flush();
        bw.close();
        br.close();
    }
}
