package test16316;

import java.io.*;
import java.util.StringTokenizer;

public class BabyBites {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean isFishy = false;

        for (int i = 1; i <= n; i++) {
            String s = st.nextToken();
            if (!s.equals("mumble")) {
                if (!s.equals(String.valueOf(i))) isFishy = true;
            }
        }

        bw.write(isFishy ? "something is fishy" : "makes sense");

        bw.flush();
        bw.close();
        br.close();
    }
}
