package test31907;

import java.io.*;

public class GISTPicker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        String dot = ".";
        String gLine = "G".repeat(k) + dot.repeat(3 * k) + "\n";
        String top = gLine.repeat(k);

        String itLine = dot.repeat(k) + "I".repeat(k) + dot.repeat(k) + "T".repeat(k) + "\n";
        String mid = itLine.repeat(k);

        String sLine = dot.repeat( 2 * k) + "S".repeat(k) + dot.repeat(k) + "\n";
        String bottom = sLine.repeat(k);

        sb.append(top).append(mid).append(bottom);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
