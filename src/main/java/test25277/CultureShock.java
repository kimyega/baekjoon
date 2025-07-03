package test25277;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CultureShock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Pattern p = Pattern.compile("(he|him|she|her)");
        Matcher m;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            m = p.matcher(word);

            if (m.matches()) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
