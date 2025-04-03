package test10987;

import java.io.*;

public class VowelCounter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int prevLength = str.length();
        str = str.replaceAll("[aeiou]", "");
        int noVowels = str.length();
        int result = prevLength - noVowels;
        bw.write(result + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
