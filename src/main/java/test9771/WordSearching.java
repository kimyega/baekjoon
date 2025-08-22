package test9771;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearching {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String line = "";
        int count = 0;

        Pattern p = Pattern.compile(word);
        Matcher m;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            m = p.matcher(line);

            while (m.find()) {
                count++;
            }
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
