package test28214;

import java.io.*;
import java.util.StringTokenizer;

public class CreamBread {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int count = 0;

        while (n-- > 0){
            int sum = 0;

            for (int j = 0; j < k; j++) {
                int c = Integer.parseInt(st.nextToken());
                sum += c;
            }

            if (k - sum < p) count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
