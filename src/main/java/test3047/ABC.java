package test3047;

import java.io.*;
import java.util.*;

public class ABC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Integer::compareTo);

        String s = br.readLine();

        StringJoiner sj = new StringJoiner(" ");

        for (char c : s.toCharArray()) {
            int idx = c - 'A';
            sj.add(list.get(idx).toString());
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
