package test29097;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Kings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int joffrey = n * a;
        int robb = m * b;
        int stannis = k * c;

        int max = Math.max(joffrey, Math.max(robb, stannis));

        List<String> kings = new ArrayList<>();

        if (joffrey == max) kings.add("Joffrey");
        if (robb == max) kings.add("Robb");
        if (stannis == max) kings.add("Stannis");

        Collections.sort(kings);

        for (String king : kings) {
            bw.write(king + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
