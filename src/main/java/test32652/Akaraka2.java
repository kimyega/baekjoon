package test32652;

import java.io.*;

public class Akaraka2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String aka = "AKA";
        String raka = "RAKA";

        int n = Integer.parseInt(br.readLine());

        bw.write(aka + raka.repeat(n));

        bw.flush();
        bw.close();
        br.close();
    }
}
