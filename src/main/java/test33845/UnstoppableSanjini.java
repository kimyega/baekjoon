package test33845;

import java.io.*;

public class UnstoppableSanjini {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String id = br.readLine();
        String line = br.readLine();

        String res = line.replaceAll("[" + id + "]", "");

        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
