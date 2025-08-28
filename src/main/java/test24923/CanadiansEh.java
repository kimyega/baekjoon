package test24923;

import java.io.*;

public class CanadiansEh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        bw.write(line.endsWith("eh?") ? "Canadian!" : "Imposter!");

        bw.flush();
        bw.close();
        br.close();
    }
}
