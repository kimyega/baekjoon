package test6889;

import java.io.*;

public class SmileWithSimiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String[] adjectives = new String[n];
        String[] nouns = new String[m];

        for (int i = 0; i < n; i++) {
            adjectives[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            nouns[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(adjectives[i] + " as " + nouns[j] + "\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
