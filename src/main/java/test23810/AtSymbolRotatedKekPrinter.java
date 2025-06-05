package test23810;

import java.io.*;

public class AtSymbolRotatedKekPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";

        int n = Integer.parseInt(br.readLine());

        String blockLine = at.repeat(5 * n) + "\n";
        String block = blockLine.repeat(n);

        String rightBlockLine = at.repeat(n) + "\n";
        String rightBlock = rightBlockLine.repeat(n);

        StringBuilder sb = new StringBuilder();

        sb.append(block).append(rightBlock).append(block).append(rightBlock).append(rightBlock);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
