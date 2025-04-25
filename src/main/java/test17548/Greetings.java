package test17548;

import java.io.*;

public class Greetings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String greet = s.charAt(0) + s.substring(1, s.length() - 1).repeat(2) + s.charAt(s.length() - 1);
        bw.write(greet);

        bw.flush();
        bw.close();
        br.close();
    }
}
