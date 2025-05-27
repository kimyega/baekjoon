package test20540;

import java.io.*;
import java.util.Map;

public class YeongilIdealType {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Character> revMbti = Map.of(
                'E', 'I',
                'I', 'E',
                'S', 'N',
                'N', 'S',
                'T', 'F',
                'F', 'T',
                'J', 'P',
                'P', 'J'
        );

        String mbti = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (char c : mbti.toCharArray()) {
            sb.append(revMbti.get(c));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
