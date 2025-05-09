package test33651;

import java.io.*;

public class Vandalism {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String uapc = "UAPC";
        String word = br.readLine();

        String res = uapc.replaceAll("[" + word + "]", "");
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
