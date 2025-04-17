package test8674;

import java.io.*;
import java.util.StringTokenizer;

public class Tabliczka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long total = a * b;
        long result = 0;


        bw.write( "");

        bw.flush();
        bw.close();
        br.close();
    }
}
