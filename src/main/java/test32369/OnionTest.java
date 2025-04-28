package test32369;

import java.io.*;
import java.util.StringTokenizer;

public class OnionTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day =  Integer.parseInt(st.nextToken());
        int pos = Integer.parseInt(st.nextToken());
        int neg = Integer.parseInt(st.nextToken());

        int a = 1 , b = 1, c = 0;
        for (int i = 1; i <= day; i++) {

            a += pos;
            b += neg;
            
            if (a < b) {
                c = a;
                a = b;
                b = c;
            } else if (a == b) {
                b--;
            }
        }

        bw.write(a + " " + b);

        bw.flush();
        bw.close();
        br.close();
    }
}
