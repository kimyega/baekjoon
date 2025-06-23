package test15272;

import java.io.*;

public class HissingMicrophone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        bw.write(s.contains("ss") ? "hiss" : "no hiss");

        bw.flush();
        bw.close();
        br.close();
    }
}
