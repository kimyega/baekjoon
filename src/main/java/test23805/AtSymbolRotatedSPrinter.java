package test23805;

import java.io.*;

public class AtSymbolRotatedSPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";
        String bl = " ";

        int n = Integer.parseInt(br.readLine());

        String longBlock = at.repeat(3 * n);
        String blank = bl.repeat(n);
        String shortBlock = at.repeat(n);

        String topLine = longBlock + blank + shortBlock + "\n";
        String top = topLine.repeat(n);

        String midLine = shortBlock + blank + shortBlock + blank + shortBlock + "\n";
        String mid = midLine.repeat(3 * n);

        String bottomLine = shortBlock + blank + longBlock + "\n";
        String bottom = bottomLine.repeat(n);

        StringBuilder sb = new StringBuilder();

        sb.append(top).append(mid).append(bottom);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
