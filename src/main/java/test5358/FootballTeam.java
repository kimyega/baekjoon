package test5358;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FootballTeam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Character> map = new HashMap<>();
        map.put('i','e');
        map.put('e','i');
        map.put('I','E');
        map.put('E','I');

        String line = "";
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            for (char c : line.toCharArray()) {
                if (map.containsKey(c)) {
                    sb.append(map.get(c));
                } else {
                    sb.append(c);
                }
            }
            sb.append('\n');
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
