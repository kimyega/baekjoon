package test30958;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class SeoulCyberStudent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<Character, Integer> alphabet = new HashMap<>();

        String line = br.readLine();

        for (char c : line.toCharArray()) {
            if (c != ' ' && c != '.' && c != ',') {
                alphabet.put(c, alphabet.getOrDefault(c, 0) + 1);
            }
        }

        OptionalInt max = alphabet.values().stream()
                        .mapToInt(Integer::intValue)
                        .max();

        bw.write(max.isPresent() ? max.getAsInt() + "" : 0 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
