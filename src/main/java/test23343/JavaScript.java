package test23343;

import java.io.*;
import java.util.StringTokenizer;

public class JavaScript {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        bw.write(javaScriptCalc(a, b));

        bw.flush();
        bw.close();
        br.close();
    }
    static String javaScriptCalc (String a, String b) {
        if (isNan(a) || isNan(b)) return "NaN";
        return Integer.parseInt(a) - Integer.parseInt(b) + "";
    }

    static boolean isNan (String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return true;
        }
        return false;
    }
}
