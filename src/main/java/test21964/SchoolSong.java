package test21964;

import java.io.*;

public class SchoolSong {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String line  = br.readLine();

        String word = line.substring(length - 5);
        bw.write(word);

        bw.flush();
        bw.close();
        br.close();
    }
}
