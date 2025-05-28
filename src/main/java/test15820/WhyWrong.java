package test15820;

import java.io.*;
import java.util.StringTokenizer;

public class WhyWrong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        boolean isSmpTestPassed = true, isSysTestPassed = true;

        st = new StringTokenizer(br.readLine());
        int smpTc = Integer.parseInt(st.nextToken());
        int sysTc = Integer.parseInt(st.nextToken());

        while (smpTc-- > 0) {
            st = new StringTokenizer(br.readLine());
            int smpa = Integer.parseInt(st.nextToken());
            int sysa = Integer.parseInt(st.nextToken());

            if (smpa != sysa) isSmpTestPassed = false;
        }

        while (sysTc-- > 0) {
            st = new StringTokenizer(br.readLine());
            int smpa = Integer.parseInt(st.nextToken());
            int sysa = Integer.parseInt(st.nextToken());

            if (smpa != sysa) isSysTestPassed = false;
        }

        bw.write(isSmpTestPassed && isSysTestPassed ? "Accepted" : isSmpTestPassed ? "Why Wrong!!!" : "Wrong Answer");

        bw.flush();
        bw.close();
        br.close();
    }
}
