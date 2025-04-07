package test14935;

import java.io.*;

public class FA {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nStr = br.readLine();
        String result = faNumber(nStr);
        bw.write(result);
        br.close();
        bw.flush();
        bw.close();
    }
    static String faNumber(String nStr) {
        return faNumberHelper(nStr);
    }

    static String faNumberHelper(String current) {
        int length = current.length();
        int firstDigit = current.charAt(0) - '0';
        String next = firstDigit * length + "";

        if (next.equals(current)) {
            return "FA";
        } else {
            return faNumberHelper(next);
        }
    }
}
