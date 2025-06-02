package test23806;

import java.io.*;

public class AtSymbolSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";
        String bl = " ";

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String edgeLine = at.repeat(5 * n) + "\n";
        String edge = edgeLine.repeat(n);

        String midLine = at.repeat(n) + bl.repeat(3 * n) + at.repeat(n) + "\n";
        String mid = midLine.repeat(3 * n);

        sb.append(edge).append(mid).append(edge);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
