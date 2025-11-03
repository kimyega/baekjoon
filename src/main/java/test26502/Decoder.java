package test26502;

import java.io.*;

public class Decoder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String plain = "yaeiouYAEIOU";
        String code = "aeiouyAEIOUY";

        while (N-- > 0) {
            String decLine = "";
            String line = br.readLine();

            for (char c : line.toCharArray()) {
                int idx = plain.indexOf(c);
                if (idx != -1) decLine += code.charAt(idx);
                else decLine += c;
            }

            sb.append(decLine).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
