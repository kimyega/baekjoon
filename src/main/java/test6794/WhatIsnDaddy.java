package test6794;

import java.io.*;

public class WhatIsnDaddy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int res = n <= 5 ? 1 + n / 2 : 1 + (10 - n) / 2;

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
