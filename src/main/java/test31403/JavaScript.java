package test31403;

import java.io.*;

public class JavaScript {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String aStr = br.readLine();
        String bStr = br.readLine();
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int c = Integer.parseInt(br.readLine());
        int resultInt = a + b - c;
        int resultStr = Integer.parseInt(aStr + bStr) - c;
        bw.write(resultInt + "\n");
        bw.write(resultStr + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
