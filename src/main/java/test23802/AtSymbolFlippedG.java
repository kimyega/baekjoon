package test23802;

import java.io.*;

public class AtSymbolFlippedG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        String preLine = at.repeat(5 * n) + "\n";
        String pre = preLine.repeat(n);

        String midLine = at.repeat(n) + "\n";
        String mid = midLine.repeat(4 * n);

        sb.append(pre).append(mid);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
