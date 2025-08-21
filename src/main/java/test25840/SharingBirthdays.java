package test25840;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SharingBirthdays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        while (n-- > 0) {
            String birthday = br.readLine();
            set.add(birthday);
        }

        bw.write(set.size() + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
