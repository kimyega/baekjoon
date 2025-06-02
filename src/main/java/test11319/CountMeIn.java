package test11319;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMeIn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String vowels = "[AEIOUaeiou]";
        Pattern p = Pattern.compile(vowels);
        Matcher m;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int con = 0, vow = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int wvow = 0;
                String word = st.nextToken();
                int len = word.length();
                m = p.matcher(word);

                while (m.find()) {
                    wvow++;
                }

                con += len - wvow;
                vow += wvow;
            }

            sb.append(con + " " + vow + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
