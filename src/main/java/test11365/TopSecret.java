package test11365;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TopSecret {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line.equals("END")) break;
            sb.setLength(0);
            for (int i = 0; i < line.length(); i++) {
                sb.append(line.charAt(line.length() - 1 - i));
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
