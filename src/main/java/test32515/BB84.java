package test32515;

import java.io.*;

public class BB84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String jg = br.readLine();
        String jKey = br.readLine();
        String eg = br.readLine();
        String eKey = br.readLine();

        StringBuilder jNewKey = new StringBuilder();
        StringBuilder eNewKey = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (jg.charAt(i) == eg.charAt(i)) {
                jNewKey.append(jKey.charAt(i));
                eNewKey.append(eKey.charAt(i));
            }
        }

        bw.write(jNewKey.compareTo(eNewKey) == 0 ? jNewKey.toString() : "htg!");

        bw.flush();
        bw.close();
        br.close();
    }
}
