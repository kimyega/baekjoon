package test25813;

import java.io.*;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class ChangingStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        s = Pattern.compile("^.*?(?=U)")
                .matcher(s)
                .replaceAll(mr -> "-".repeat(mr.group().length()));


        s = Pattern.compile("(?<=F)[^F]*$")
                .matcher(s)
                .replaceAll(mr -> "-".repeat(mr.group().length()));

        int left = s.indexOf("U");
        int right = s.lastIndexOf("F");

        StringBuilder sb = new StringBuilder(s);

        IntStream.range(left + 1, right)
                .forEach(i -> sb.setCharAt(i, 'C'));

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
