package test23812;

import java.io.*;

public class PAtAngle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String at = "@";
        String bl = " ";

        int n = Integer.parseInt(br.readLine());

        String sideBlock = at.repeat(n) + bl.repeat(3 * n) + at.repeat(n) + "\n";
        String sideBlocks = sideBlock.repeat(n);

        String block = at.repeat(5 * n) + "\n";
        String blocks = block.repeat(n);

        StringBuilder sb = new StringBuilder();

        sb.append(sideBlocks).append(blocks).append(sideBlocks).append(blocks).append(sideBlocks);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
