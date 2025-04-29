package test26768;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class H4x0r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 4);
        map.put('e', 3);
        map.put('i', 1);
        map.put('o', 0);
        map.put('s', 5);

        StringBuilder sb = new StringBuilder();

        for (char c : line.toCharArray()) {
            if (map.containsKey(c)) {
                sb.append(map.get(c));
            } else {
                sb.append(c);
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
