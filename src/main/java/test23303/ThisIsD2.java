package test23303;

import java.io.*;

public class ThisIsD2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        bw.write(line.toLowerCase().contains("d2") ? "D2" : "unrated");

        bw.flush();
        bw.close();
        br.close();
    }
}
