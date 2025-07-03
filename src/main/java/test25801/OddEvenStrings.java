package test25801;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class OddEvenStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        Map<Character, Integer> alpha = new HashMap<>();

        for (char c : s.toCharArray()) {
            alpha.put(c, alpha.getOrDefault(c, 0) + 1);
        }

        int even = 0, odd = 0, len = alpha.size();

        for (Map.Entry<Character, Integer> entry : alpha.entrySet()) {
            if (entry.getValue() % 2 == 0) even++;
            else odd++;
        }

        bw.write(even == len ? "0" : odd == len ? "1" : "0/1");

        bw.flush();
        bw.close();
        br.close();
    }
}
