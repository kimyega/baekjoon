package test15238;

import java.io.*;

public class Pirates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int[] alphabets = new int[26];

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            alphabets[idx]++;
        }

        char maxAlpha = '0';
        int max = 0;

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                maxAlpha = (char) (i + 'a');
            }
        }

        bw.write(maxAlpha + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}
