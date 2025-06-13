package test30957;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class InformationSecurity {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Integer> info = new LinkedHashMap<>();
        info.put('B', 0);
        info.put('S', 0);
        info.put('A', 0);

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        for (char c : s.toCharArray()) {
            info.put(c, info.get(c) + 1);
        }

        int max = 0;
        for (Map.Entry<Character, Integer> entry : info.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : info.entrySet()) {
            if (entry.getValue() >= max) {
                sb.append(entry.getKey());
            }
        }

        bw.write(sb.toString().length() == 3 ? "SCU" : sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
