package test30402;

import java.io.*;

public class GammaCore {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.toString().charAt(i);

            if (c == 'w') {
                bw.write("chunbae");
                break;
            } else if (c == 'b') {
                bw.write("nabi");
                break;
            } else if (c == 'g') {
                bw.write("yeongcheol");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
