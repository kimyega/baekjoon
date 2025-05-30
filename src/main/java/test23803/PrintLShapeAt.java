package test23803;

import java.io.*;

public class PrintLShapeAt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String at = "@";


        int n = Integer.parseInt(br.readLine());

        String hl = at.repeat(n) + "\n";
        String h = hl.repeat(4 * n);

        String wl = at.repeat(5 * n) + "\n";
        String w = wl.repeat(n);

        w = w.substring(0, w.length() - 1);

        bw.write(h + w);

        bw.flush();
        bw.close();
        br.close();
    }
}
