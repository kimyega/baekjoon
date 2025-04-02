package test2742;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Print {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lineNo = Integer.parseInt(br.readLine());
        for (int i = 0; i < lineNo; i++) {
            bw.write((lineNo - i) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
