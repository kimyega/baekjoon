package test23811;

import java.io.*;

public class AtSymbolT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";

        int n = Integer.parseInt(br.readLine());

        String atLine = at.repeat(5 * n) + "\n";
        String block = atLine.repeat(n);

        String atLeft = at.repeat(n) + "\n";
        String leftBlock = atLeft.repeat(n);

        StringBuilder sb = new StringBuilder();

        sb.append(block).append(leftBlock).append(block).append(leftBlock).append(block);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
