package test30617;

import java.io.*;
import java.util.StringTokenizer;

public class Knob {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int funness = 0, preLeft = 0, preRight = 0;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if (left != 0 && preLeft == left) funness++;
            if (right != 0 && preRight == right) funness++;
            if (left != 0 && left == right) funness++;

            preLeft = left;
            preRight = right;
        }

        bw.write(funness + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
