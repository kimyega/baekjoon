package test32399;

import java.io.*;

public class BurgerSorter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int mid = 0, move = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (mid > 0) move++;
            } else if (c == '1') {
                mid++;
            } else if (c == ')') {
                if (mid <= 0) move++;
            }
        }

        bw.write(move + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
