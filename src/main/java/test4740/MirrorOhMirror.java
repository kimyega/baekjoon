package test4740;

import java.io.*;

public class MirrorOhMirror {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("***")) break;

            String reverse = new StringBuilder(line).reverse().toString();
            sb.append(reverse).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
