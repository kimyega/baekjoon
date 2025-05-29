package test23794;

import java.io.*;

public class AtSquarePrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String at = "@", bl = " ";

        int n = Integer.parseInt(br.readLine());

        String fix = at.repeat(n + 2) + "\n";
        String line = at + bl.repeat(n) + at + "\n";
        String mid = line.repeat(n);

        StringBuilder sb = new StringBuilder();
        sb.append(fix);
        sb.append(mid);
        sb.append(fix);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
