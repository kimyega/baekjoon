package test23808;

import java.io.*;

public class AtSymbolPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";
        String bl = " ";

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        String topLine = at.repeat(n) + bl.repeat(3 * n) + at.repeat(n) + "\n";
        String top = topLine.repeat(2 * n);

        String sqTp1Line = at.repeat(5 * n) + "\n";
        String sqEdge = sqTp1Line.repeat(n);
        String sqMid = topLine.repeat(n);

        sb.append(top).append(sqEdge).append(sqMid).append(sqEdge);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
