package test10203;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Pattern p = Pattern.compile("[aeiou]");
        Matcher m;
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String s = br.readLine();
//            m = p.matcher(s);
//
//            int cnt = 0;
//            while (m.find()) cnt++;

            long cnt = s.chars().filter(ch -> "aeiou".indexOf(ch) >= 0).count();

            sb.append(String.format("The number of vowels in despicable is %d.\n", cnt));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
