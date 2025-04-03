package test2038;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RugbyClub {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if (name.equals("#") && age == 0 && weight == 0) break;
            sb.setLength(0);
            if (age > 17 || weight >= 80) {
                sb.append(name + " Senior");
            } else {
                sb.append(name + " Junior");
            }
            list.add(sb.toString());
        }
        for (String str : list) {
            bw.write(str + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
