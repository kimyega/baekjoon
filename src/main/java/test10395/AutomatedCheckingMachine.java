package test10395;

import java.io.*;
import java.util.StringTokenizer;

public class AutomatedCheckingMachine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        boolean check = true;

        while (st1.hasMoreTokens()) {
            String s = st1.nextToken();
            if (s.equals(st2.nextToken())) check = false;
        }

        bw.write(check ? "Y" : "N");

        bw.flush();
        bw.close();
        br.close();
    }
}
