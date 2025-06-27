package test6830;

import java.io.*;
import java.util.StringTokenizer;

public class ItsColdHere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String res = "", line = "";
        int min = Integer.MAX_VALUE;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            String city = st.nextToken();
            int tp = Integer.parseInt(st.nextToken());

            if (tp < min) {
                min = tp;
                res = city;
            }
        }

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
