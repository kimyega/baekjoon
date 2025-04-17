package test6887;

import java.io.*;

public class Squares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int len = (int) Math.sqrt(n);

        bw.write("The largest square has side length " + len + ".");

        bw.flush();
        bw.close();
        br.close();
    }
}
