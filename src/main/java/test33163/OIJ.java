package test33163;

import java.io.*;

public class OIJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();

        String res = line.replaceAll("J", "o").replaceAll("O", "i").replaceAll("I", "J").toUpperCase();
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
