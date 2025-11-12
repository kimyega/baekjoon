package test34703;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class GongGangProtector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        while (n-- > 0) {
            set.add(Integer.parseInt(br.readLine()));
        }

        bw.write(set.size() != 5 ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
