package test21665;

import java.io.*;
import java.util.StringTokenizer;

public class MisaAndNegative {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] negImages = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            line = line.replaceAll("B", ",").replaceAll("W", "B").replaceAll(",", "W");
            negImages[i] = line.toCharArray();
        }

        br.readLine();
        int count = 0;

        for (char[] image : negImages) {
            String line = br.readLine();

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != image[i]) {
                    count++;
                }
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
