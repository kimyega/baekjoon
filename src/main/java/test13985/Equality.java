package test13985;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Equality {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> num = new ArrayList<>();
        String line =  br.readLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(line);

        while (m.find()) {
            num.add(Integer.parseInt(m.group()));
        }

        int a = num.get(0);
        int b = num.get(1);
        int c = num.get(2);
        int sum = a + b - c;
        if (sum != 0) {
            bw.write("NO");
        } else {
            bw.write("YES");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
