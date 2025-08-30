package test25785;

import java.io.*;

public class EasyToPronounceWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        String vowels = "aeiou";
        boolean easy = true;

        for (int i = 0; i < word.length() - 1; i++) {
            boolean currV = vowels.indexOf(word.charAt(i)) >= 0;
            boolean nextV = vowels.indexOf(word.charAt(i + 1)) >= 0;
            if (currV == nextV) {
                easy = false;
                break;
            }
        }

        bw.write(easy ? "1" : "0");

        bw.flush();
        bw.close();
        br.close();
    }
}
