package test23627;

import java.io.*;

public class Driip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(s.matches(".*driip$") ? "cute" : "not cute");

        bw.flush();
        bw.close();
        br.close();
    }
}
