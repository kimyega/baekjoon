package test21875;

import java.io.*;

public class Innohorse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String start = br.readLine();
        String end = br.readLine();

        int x = Math.abs(start.charAt(0) - end.charAt(0));
        int y = Math.abs(start.charAt(1) - end.charAt(1));

        bw.write(Math.min(x, y) + " " + Math.max(x, y));

        bw.flush();
        bw.close();
        br.close();
    }
}
